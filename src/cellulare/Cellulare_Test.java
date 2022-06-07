package cellulare;
import java.util.Scanner;
public class Cellulare_Test {
    public static void main(String [] arg){
        Scanner ricarica1 = new Scanner(System.in);
        System.out.println("Inserisci qui l'importo da ricaricare:");
        String ricarica= ricarica1.nextLine();
        int ricCell=Integer.parseInt(ricarica);//converto il dato letto in stringa in un intero
        Cellulare Cell1=new Cellulare(ricCell);
        double soldi= Cell1.getCarica();
        System.out.println("La tua carica è di:"+ soldi);
        double numeroChimate= Cell1.numero_chiamate_disp();
        System.out.println("il numero di chiamante consentite è di:"+ numeroChimate);
    }
}
