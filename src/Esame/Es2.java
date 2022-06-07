package Esame;

// Definizione Wildcard
// Wildcard ottimi per garantire polimorfismo o per garantire riutilizzo di codice da una superclasse ad una sottoclasse
// Garantire Covarianza e Controvarianza del dominio e del codominio della function

// Function<? super Integer, ? extends Number> myf = (x) -> x+1;

// Type argument
// Non si possono subsumere

// No variabili di tipo wildcard
// List<?> a;           // Wildcard UNBOUND
// List<? extends Integer> a2;// Wildcard upperbound
// List<? super Integer> a3;    //wildcard lowerbound, di tipo integer o supertipo
// Integer n = a1.get(0);
// List<CharSequence> myL = new ArrayList<String>(); // Non è possibile

// Piccola Pool di Thread
// Insieme di thread preistanziati, e quando servono si fa un acquire e si chiamano thread già usati, e, o garbage collector o finalizzed
// Si usano i Monitor, usati per fermare e riattivare, oggetto di raccolta
// Condition: oggetto su cui fai wait o notify
// mutex, semafero, lock & unlock
// thread va in pausa solo con condition (una wait) o va

import java.util.ArrayList;
import java.util.List;

public class Es2 {
    public static class ThreadPool extends Thread{
        private final List<PooledThread> pool;

        public ThreadPool(){
            pool = new ArrayList<>(10);
            spawn();
        }

        public ThreadPool(int prespawn){
            pool = new ArrayList<>(prespawn);
            spawn();
        }

        private void myWait(){}

        public void spawn() {
            for(int i = 0; i<pool.size(); i++){
                pool.add(new PooledThread(() -> {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));
            }
        }

        public void acquire(Runnable r){
            PooledThread temp;                                        // Se fosse statica non avrebbe compilato qua
            if(pool.size()>0){
                temp = pool.remove(0);
                temp.r = r;
                temp.notify();
            } else
                System.out.println("Bisogna istanziare ancora!!");
        }

        // InnerClass
        public class PooledThread extends Thread{           // Non deve essere statica, quindi è legata all'istanza dell'oggetto ThreadPool
            private Runnable r;

            public PooledThread (Runnable target){
                this.r = target;
            }

            @Override
            public void run() {
                while(true) {
                    r.run();
                    pool.add(this);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadPool myPool = new ThreadPool(5);

        myPool.acquire(() -> {System.out.println("ciao");});
    }
}
