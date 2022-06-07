package PreparazioneEsame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConsumerProducerTest2 {

    private static Random rnd = new Random();

    //Metodo che ritorna un numero casuale compreso tra (a,b)
    private static synchronized int rand(int a, int b){
        return rnd.nextInt(b-a+1)+a;
    }
    //è come fare il blocco "synchronized" su tutto il corpo, usando come mutex:
    // (ConsumerProducer.class) se il metodo è STATICO. è prodotto a runtime.
    // (this) se il metodo è NON STATICO.

    //Metodo che scrive il nome del thread e un messaggio associato.
    private static void log(String msg){
        Thread self = Thread.currentThread(); // Ritorna l'oggetto che rappresenta il thread corrente.
        System.out.println(String.format("%s[%d]: %s", self.getName(), self.getId(), msg));
    }

    Class<ConsumerProducerTest2> cl = ConsumerProducerTest2.class;
    //Questa è una classe di tipo "classe" con ConsumerProducer come generic, che RAPPRESENTA la classe.

    private static Object dummy = new Object(); //Oggetto generico utilizzato come semaforo



    // CONSUMATORE
    public static class Consumer extends Thread {
        private List<Integer> l;
        //N.b.: l non è una variabile a sé, ma un puntatore allo stesso arraylist che punta anche Producer!

        public Consumer(List<Integer> l){
            this.l=l;
        }

        @Override
        public void run(){
            long ms = rand(1, 10);
            while(true){
                //SEZIONE CRITICA:
                synchronized (dummy) { //Tutto ciò che è dentro a queste graffe è garantito essere atomico
                    //dezucchero: dummy.lock();
                    if(!l.isEmpty()){
                        int n = l.remove(0); //Legge e TOGLIE l'elemento in testa
                        log(String.format("Consumer: pop %d (size: %d) %s",n,l.size(),l));
                    }
                    //dezucchero: dummy.unlock();
                } // n.b.: tutto quello compreso fra graffe è uno statement.
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // PRODUTTORE
    public static class Producer extends Thread {
        private List<Integer> l;
        private int counter = 0;

        public Producer(List<Integer> l){
            this.l=l;
        }

        @Override
        public void run(){
            long ms = rand(1, 10);
            while(true){
                synchronized (dummy){
                    int n = rand(0,1000);
                    l.add(n);
                    log(String.format("Producer: push %d (size: %d) %s",n,l.size(),l));
                }
                //non è importante che semaforo usare: ma bisogna usare lo stesso! (altrimenti non ha senso)
                try{
                    Thread.sleep(ms);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            List<Integer> l = new ArrayList<>();
            Consumer c = new Consumer(l);
            Producer p = new Producer(l);

            //Proviamo tramite anonymous class.
            Thread p1 = new Thread() {
                private int counter = 0; //CAMPO della classe (NON VARIABILE LOCALE)
                @Override
                public void run() {
                    long ms = rand(1, 10);
                    while(true) {
                        synchronized (dummy) {
                            int n = rand(0, 1000);
                            l.add(n);
                            log(String.format("Producer: push %d (size: %d) %s", n, l.size(), l));
                        }
                        //non è importante che semaforo usare: ma bisogna usare lo stesso! (altrimenti non ha senso)
                        try {
                            Thread.sleep(ms);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            c.start();
            p.start();
            c.join();
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Programmazione top-down: Prima programmo il chiamante (main),
// poi il chiamato (metodi più in basso).

// Race condition: quando due thread modificano "contemporaneamente" gli stessi dati rendendo i dati inconsistenti ("corrotti").
// I thread infatti possono essere interrotti durante operazioni non atomiche (es. stampa su prompt).
// Un'istruzione può essere interrotta a livello basso (assembly, jvm).
// Per risolvere aggiungiamo un mutex (semaforo per la mutua esclusione).
// Possiamo quindi creare una "sezione critica", ovvero un insieme di istruzioni atomico.

// Come semaforo, posso utilizzare anche un Object dummy esterno che non c'entra niente!
// Synchronized può essere anche scritto prima di un metodo. (zucchero sintattico)

// IN SOSTANZA: Le parti di codice dei thread che MODIFICANO la stessa struttura dati condivisa vanno SINCRONIZZATE.
// Se accedono in SOLA LETTURA, non è necessario (non ci sono modifiche che possono lasciare la memoria in stato inconsistente!)

// Pro tip: per thread che servono una volta sola, posso fare l'anonymous class al volo overridando run();
// Altrimenti, costruisco una sottoclasse.

