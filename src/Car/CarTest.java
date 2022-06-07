package Car;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] arg){
        Scanner ricarica2 = new Scanner(System.in);
        Scanner chilometri1 = new Scanner(System.in);
        System.out.println("Inserisci qui i litri da ricaricare:");
        String ricarica= ricarica2.nextLine();
        int b1=Integer.parseInt(ricarica);
        System.out.println("Inserisci qui i km da fare:");
        String km= chilometri1.nextLine();
        int a1=Integer.parseInt(km);
        System.out.println("Inserisci il tipo di carburante");
        String z1= chilometri1.nextLine();
        Car Audi=new Car(a1,b1,z1);

        if(Audi.getGas()<5) {
            System.out.println("ATTENZIONE Prima di partire FARE RIFORNIMENTO");
            System.out.println("Ti mancano"+" " + -1*(Audi.getGas())+ " " + "litri");
        }else {
            System.out.println("Per questo viaggio di km:"+" "+a1+" "+"consumi:"+" " + Audi.drive(a1));
            System.out.println("Buon Viaggio");
        }
    }
}
