package Sort;
import java.util.Scanner;

public class StortTest {
    public static void  main(String arg[]){
        Scanner leggi= new Scanner(System.in);
        System.out.println("Inserisci qui i tre numeri diversi tra di loro:");
        String leggi_primo= leggi.nextLine();
        String leggi_secondo=leggi.nextLine();
        String leggi_terzo=leggi.nextLine();
        int a=Integer.parseInt(leggi_primo);
        int b=Integer.parseInt(leggi_secondo);
        int c=Integer.parseInt(leggi_terzo);
        Sort3 lettura=new Sort3(a,b,c);
        if(a!=b && a!=c && b!=c){
            System.out.println("Il più piccolo è:" + "" + lettura.Piccolo(a, b, c));
            System.out.println("Il medio è:" + "" + lettura.Medio(a, b, c));
            System.out.println("Il più grande è:" + "" + lettura.Grande(a, b, c));
        }
    }
}
