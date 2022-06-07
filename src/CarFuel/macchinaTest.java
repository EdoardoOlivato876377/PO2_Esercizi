package CarFuel;

import java.util.Scanner;

public class macchinaTest {
    public static void main(String [] arg){
        System.out.println("Seleziona il tipo di carburante:");
        Scanner nuovoCarburante = new Scanner(System.in);
        String carburanteDigitato= nuovoCarburante.nextLine();
        int carburanteDigitato1=Integer.parseInt(carburanteDigitato);
        Macchine myPersonalCar=new MyPersonalCar(carburanteDigitato1);
        System.out.println("Lei nella sua macchina hai:" + " " + myPersonalCar.gettotaleserbatoio());
    }
}
