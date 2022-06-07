package SimulazioneEsame_1.CarSharing;

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

import java.util.Scanner;

public class Simulator {
    public static void main(String [] argv){
        double guadagno=0, guadagno2=0, guadagno3=0, guadagnototale=0;

        Passeggeri Guidatore=new Passeggeri();
        System.out.println("Inserire qui numero di stazione di partenza Guidatore ");
        Scanner leggi= new Scanner(System.in);
        String GDA= leggi.nextLine();
        Guidatore.stazione_di_partenza=Integer.parseInt(GDA);
        System.out.println("Inserire qui numero di stazione di destinazione Guidatore ");
        String GA= leggi.nextLine();
        Guidatore.stazione_di_destinazione=Integer.parseInt(GA);
        Stazione partenza1=new Stazione(Guidatore.stazione_di_partenza);


        if(partenza1.getEstraiNumeroAuto()>0){
            Passeggeri P1=new Passeggeri();
            Passeggeri P2=new Passeggeri();
            Passeggeri P3=new Passeggeri();

            System.out.println("Posso partire");
            System.out.println("Inserire qui numero di stazione di partenza del primo cliente: ");
            String PCDA= leggi.nextLine();
            P1.stazione_di_partenza=Integer.parseInt(PCDA);
            System.out.println("Inserire qui numero di stazione di destinazione del primo cliente: ");
            String PCA= leggi.nextLine();
            P1.stazione_di_destinazione=Integer.parseInt(PCA);
            if(P1.stazione_di_destinazione<=Guidatore.stazione_di_destinazione){
                Car myCar=new Car(P1.stazione_di_partenza,P1.stazione_di_destinazione);
                System.out.println("Dal cliente numero uno guadagna:"+myCar.calcolaGuadagno(P1.stazione_di_partenza,P1.stazione_di_destinazione));
                guadagno=myCar.calcolaGuadagno(P1.stazione_di_partenza,P1.stazione_di_destinazione);
            }
            else{
                 System.out.println("Destinazione non presente nel persorso");
            }

            System.out.println("Inserire qui numero di stazione di partenza del secondo cliente: ");
            String SCDA= leggi.nextLine();
            P2.stazione_di_partenza=Integer.parseInt(SCDA);
            System.out.println("Inserire qui numero di stazione di destinazione del secondo cliente: ");
            String SCA= leggi.nextLine();
            P2.stazione_di_destinazione=Integer.parseInt(SCA);
            if(P2.stazione_di_destinazione<=Guidatore.stazione_di_destinazione){
                Car myCar2=new Car(P2.stazione_di_partenza,P2.stazione_di_destinazione);
                System.out.println("Dal cliente numero due guadagna:"+myCar2.calcolaGuadagno(P2.stazione_di_partenza,P2.stazione_di_destinazione));
                guadagno2=myCar2.calcolaGuadagno(P2.stazione_di_partenza,P2.stazione_di_destinazione);
            }
            else{
                System.out.println("Destinazione non presente nel persorso");
            }

            System.out.println("Inserire qui numero di stazione di partenza del terzo cliente: ");
            String TCDA= leggi.nextLine();
            P3.stazione_di_partenza=Integer.parseInt(TCDA);
            System.out.println("Inserire qui numero di stazione di destinazione del terzo cliente: ");
            String TCA= leggi.nextLine();
            P3.stazione_di_destinazione=Integer.parseInt(TCA);
            if(P3.stazione_di_destinazione<=Guidatore.stazione_di_destinazione){
                Car myCar3=new Car(P3.stazione_di_partenza,P3.stazione_di_destinazione);
                System.out.println("Dal cliente numero due guadagna:"+myCar3.calcolaGuadagno(P3.stazione_di_partenza,P3.stazione_di_destinazione));
                guadagno3=myCar3.calcolaGuadagno(P3.stazione_di_partenza,P3.stazione_di_destinazione);
            }
            else{
                System.out.println("Destinazione non presente nel persorso");
            }
            guadagnototale=guadagno3+guadagno2+guadagno;
            System.out.println("In totale in questo viaggio, ha guadagnato:"+ guadagnototale);

        }else{
            System.out.println("Auto non disponibili");
        }
    }
}
