package SimulazioneEsame_1.CarSharing;
import java.util.Random;

public class Stazione {
    private int numero_auto_stazione=0;

    //estraggo il numero di auto per stazione
    private void estraiNumAuto() {
        Random rand = new Random();
        this.numero_auto_stazione = rand.nextInt(10); //va anche senza il this l'ho messo per provare
    }
    //getter del numero estratto
    public int getEstraiNumeroAuto(){
        return numero_auto_stazione;
    }

    Stazione(int a){
        estraiNumAuto();
        getEstraiNumeroAuto();
    }
}
