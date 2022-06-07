package ProgettoATM;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ATM {
    public static void main(String [] args){
        System.out.println("Inserisci l'ID");
        Scanner input = new Scanner(System.in);
        int ID= input.nextInt();
        Utente u1=new Utente();
        int count=0;
        while(count<3){
            if(u1.getUsername()==ID){
                System.out.println("Inserisci la password");
                int pass= input.nextInt();
                if(u1.getPassword()==pass){
                    count=3;
                    System.out.println("Seleziona l'operazione");
                    System.out.println("Scrivere:\n"+
                            "<- per Prellevare\n"+
                            "-> per Versare\n");
                    String operazione=input.next();
                    System.out.println("Inserire l'importo solo cifre");
                    Double importo=input.nextDouble();
                    ContoCorrente CCu1=new ContoCorrente(importo);
                    if(operazione=="<-"){
                        CCu1.Prelleva(importo);
                        System.out.println("L'importo residuo nel tuo conto è di:");
                        System.out.println(CCu1.getimportoConto());
                    }else if(operazione=="->"){
                        CCu1.Versamento(importo);
                        System.out.println("L'importo residuo nel tuo conto è di:");
                        System.out.println(CCu1.getimportoConto());
                    }
                }else{
                    count++;
                    System.out.println("Errore Password ERRATA,hai ancora tentativi:");
                    System.out.println(3-count);
                }
            }else{
                count++;
                System.out.println("Errore ID ERRATO, hai ancora tentativi:");
                System.out.println(3-count);
            }
        }
        System.out.println("Hai terminato Grazie e Arrivederci");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("OPERAZIONE TERMINATA");
            }
        },  10000);
    }
}




