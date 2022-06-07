package EserciziPreparazione;

import java.util.Scanner;

public class mediamaggiori {
    private static int[]  mynumber=new int[5];
    private static int media=0,somma=0;
    static int i=0;
    public static int leggi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduci 5 numeri interi:");
        for(i=0;i<5;i++) {
            String num = scan.next();
            int numero = Integer.parseInt(num);
            mynumber[i]=numero;
        }
        for(int j=0;j<5; j++){
            somma=mynumber[j]+somma;
        }
        return media=somma/5;
    }
}
