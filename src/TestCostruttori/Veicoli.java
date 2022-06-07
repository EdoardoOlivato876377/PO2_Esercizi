package TestCostruttori;
import java.lang.String;
public class Veicoli {
    private int cilindrata=0;
    private String carburante;

    public int setcilindrata(int x){
        cilindrata=x;
        return cilindrata;
    }

    public String setcarburante(String x){
        carburante=x;
        return carburante;
    }

    public int getcilindrata(){
        return cilindrata;
    }

    public String getcarburante(){
        return carburante;
    }

    public Veicoli(int x, String y){
        cilindrata=x;
        carburante=y;
        System.out.println(cilindrata);
        System.out.println(carburante);
    }
}
