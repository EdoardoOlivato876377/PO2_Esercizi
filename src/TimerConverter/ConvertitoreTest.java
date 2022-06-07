package TimerConverter;

import java.util.Scanner;

public class ConvertitoreTest {
    public static void  main(String[] argv){

        Scanner letturaorario= new Scanner(System.in);
        System.out.println("Inserire i giorni:");
        String letgiorni= letturaorario.nextLine();
        System.out.println("Inserire le ore:");
        String letore= letturaorario.nextLine();
        System.out.println("Inserire i minuti:");
        String letminuti= letturaorario.nextLine();
        System.out.println("Inserire i secondi:");
        String letsecondi= letturaorario.nextLine();
        int giorni=Integer.parseInt(letgiorni);
        int ore=Integer.parseInt(letore);
        int minuti=Integer.parseInt(letminuti);
        int secondi=Integer.parseInt(letsecondi);
        TimerConverter orario = new TimerConverter(secondi,minuti,ore,giorni);
        System.out.println("Conversione in secondi:"+" "+orario.Convertitore(secondi,minuti,ore,giorni));
    }
}
