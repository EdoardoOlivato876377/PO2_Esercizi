package EserciziIteratori.Carico;

import java.util.ArrayList;

public class Deperibili extends Prodotto{
    private int temperatura;
    public int getTemperatura(){
        return temperatura;
    }
    public void Settemperature(int x){
        temperatura=x;
    }
    public Deperibili(int x, String name, int quantity, Double price){
            super(name,quantity,price);
        Settemperature(x);
    }

}
