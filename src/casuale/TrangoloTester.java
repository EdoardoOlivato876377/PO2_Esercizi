package casuale;
import java.util.Scanner;
public class TrangoloTester {
    public static void main4(String [] args){
        Rettangolo r=new Rettangolo();
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("Area: " + r.Area());
        Scanner altezza = new Scanner(System.in);
        Scanner ascissa = new Scanner(System.in);
        Scanner ordinata = new Scanner(System.in);
        Scanner base = new Scanner(System.in);
        System.out.println("Base");
        int base1=base.nextInt();
        System.out.println("Altezza");
        int altezza1=altezza.nextInt();
        System.out.println("Ascissa");
        int ascissa1=ascissa.nextInt();
        System.out.println("Ordinata");
        int ordinata1=ordinata.nextInt();
        Rettangolo rr = new Rettangolo(base1,altezza1, ascissa1, ordinata1);
        System.out.println("Perimetro: " + rr.perimetro());
        System.out.println("Area: " + rr.Area());
    }
}
