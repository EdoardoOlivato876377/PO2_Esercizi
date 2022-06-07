package CarFuel;
import java.util.Scanner;
public class Macchine extends benzinaio{
    //la macchina consuma 5 litri al km
    private static double carburante=0;//Carburante presente nella macchina
    private static double totaleserbatoio=carburante;
    private static int tipoCarburante=20;//benzina
    public static int getTipoCarburante(){
        return tipoCarburante;
    }
    public static double gettotaleserbatoio(){
        return totaleserbatoio;
    }
    public static void setTipoCarburante(int nuovoCarburante){
        tipoCarburante=nuovoCarburante;
    }
    public void Rifornimento(int fuell ){//come parametro il carburante della macchina
        Scanner ricarica = new Scanner(System.in);
        if(fuell==tipoCarburante){
            System.out.println("Quanti litri vuoLe?");
            String rifornimento= ricarica.nextLine();
            double b=Double.parseDouble(rifornimento);
            totaleserbatoio=b+totaleserbatoio;
            System.out.println("Ha un totale di:"+ " " + CostoCarburante(tipoCarburante,b) + " " + "Euro");
        }
    }
}
