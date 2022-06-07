package Car;
public class Car {
    //consuma 5 litri al km
    public static double carburante=0;
    public static String tipoCarburante="Benzina";
    public static double drive(double km){
        double consumo=0.05*km;
        carburante=carburante-consumo;
        return consumo;
    }
    public static double getGas(){
        return carburante;
    }
    public static void addGas(double rifornimento,String tipo){
        if(tipo==tipoCarburante)
        carburante=carburante+rifornimento;
        else
            System.out.println("Carburante sbaglaito");
    }
    public Car(double a, double b,String z){
        carburante=0;
        drive(a);
        getGas();
        addGas(b,z);
    }
}
