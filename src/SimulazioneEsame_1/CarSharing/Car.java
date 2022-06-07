package SimulazioneEsame_1.CarSharing;
import java.util.ArrayList;

/*
Simulate un sistema di car sharing usato da lavoratori pendolari per caricare e scaricare passeggeri in apposite stazioni.
Immaginate che ci siano 30 stazioni, a un miglio di distanza una dall’alta lungo un determinato percorso: per ogni
stazione generate un numero casuale di automobili, ciascuna con una destinazione determinata casualmente, e un numero
casuale di passeggeri, ciascuno con una destinazione ancora determinata casualmente. Ogni guidatore carica a bordo tre
passeggeri a caso, scelti tra quelli la cui destinazione precede quella del guidatore, scaricandoli nella stazione
giusta e caricando, se possibile, altri passeggeri. La tariffa che viene pagata al guidatore e’ un importo costante per
ciascun miglio di distanza percorso da ciascun passeggero. Eseguite la simulazione mille
volte e visualizzate l’incasso medio per miglio percorso. Progettate le classi Car (automobile), Passenger (passeggero),
Station (stazione) e Simulation (simulazione).
 */


public class Car {
    ArrayList <Integer> auto=new ArrayList <Integer>(10);
    private void addAuto(){
        //serve per sorteggiare randomicamente un numero di auto per stazione
        auto.add(0);
        auto.add(5);
        auto.add(8);
        auto.add(4);
        auto.add(0);
        auto.add(10);
        auto.add(8);
        auto.add(0);
        auto.add(1);
        auto.add(12);
    }
    //calcola il percorso
    public double calcoloPercorso(int a, int b){
        double distanza=0;
        //a=partenza
        //b=destinazione
        if(a<b){
            return distanza=b-a;
        }else{
            return distanza=(a-b)%2;
        }
    }
    //calcolo il guadagno per passeggero
    public double calcolaGuadagno(int a, int b){
        double guadagnoApasseggero=0;
        return guadagnoApasseggero=calcoloPercorso(a,b)*1.00;
    }
    Car(int part, int dest){
        calcolaGuadagno(part,dest);
    }
}
