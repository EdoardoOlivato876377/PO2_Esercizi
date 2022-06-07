package ConvertitioreDiValute;

import java.util.Scanner;

public class MainTestConversione {
    public static void main(String [] args){
        double convertito=0;
        System.out.println("Elenco conversioni consentite:");
        System.out.println(" ");
        System.out.println("Fiorino         Codice ANG  2,12 -> 1 Euro");
        System.out.println(" ");
        System.out.println("Pula            Codice BWP  13,16 -> 1 Euro");
        System.out.println(" ");
        System.out.println("Peso Cubano     Codice CUP  31,26 -> 1 Euro");
        System.out.println(" ");
        System.out.println("Rupia Indiana   Codice IND  87,55 -> 1 Euro");
        System.out.println(" ");
        System.out.println("Inserisci il codice della valuta che vuoi convertire in EURO:");
        Scanner input = new Scanner(System.in);
        String valuta= input.nextLine();//codie valuta
        System.out.println("Inserisci la quantità da convertire:");
        Double quantità= input.nextDouble();//quantità da convertire
        ConvertiDaFiorini conv1=new ConvertiDaFiorini();
        ConvertiDaPula conv2=new ConvertiDaPula();
        ConvertiDaPesoCubano conv3=new ConvertiDaPesoCubano();
        ConvertiDaRupiaIndiana conv4=new ConvertiDaRupiaIndiana();
        if(valuta=="ANG"){//Fiorino
            convertito = conv1.convertiValore(quantità);
        }else if(valuta=="BWP"){//Pula
            convertito = conv2.convertiValore(quantità);
        }else if(valuta=="CUP"){//Peso Cubano
            convertito = conv3.convertiValore(quantità);
        }else if(valuta=="IND"){//Rupia Indiana
            convertito = conv4.convertiValore(quantità);
        }else{
            System.out.println("Conversione non consentita");
        }
        System.out.println("Il risulatato della converisone è:"+ convertito);
    }
}
