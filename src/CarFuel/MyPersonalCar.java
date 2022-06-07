package CarFuel;
import java.util.Scanner;
public class MyPersonalCar extends Macchine{
    //la mia macchina consuma 0.05 per km
    private double consumo=0.50;
    public double getConsumoCarb(){
        return consumo;
    }
    public void consumo(){
        System.out.println("Quanti chilometri deve fare?");
        Scanner chilometri1 = new Scanner(System.in);
        String km= chilometri1.nextLine();
        double km1=Double.parseDouble(km);
        double consumototaleprevisto=km1*(getConsumoCarb());
        double tot=gettotaleserbatoio()-consumototaleprevisto;
        if(tot>0){
            System.out.println("Ok puoi partire");
        }else
            System.out.println("ATTENZIONE, devi fare benzina");
    }
    public MyPersonalCar(int carb){
        setTipoCarburante(carb);
        Rifornimento(getTipoCarburante());
        System.out.println("Il tuo computer di bordo");
        consumo();
        gettotaleserbatoio();
    }
}
