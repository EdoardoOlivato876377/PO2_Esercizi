package EserciziIteratori.Carico;

public class Collettame extends Prodotto {
    private int temperatura;
    public int getTemperatura(){
        return temperatura;
    }
    public void Settemperature(int x){
        try{
            temperatura=x;
        }catch(Exception e){
            System.out.println("Camino non dotato di Frigo, settare a null la ");
        }
    }
    public Collettame(int x, String name, int quantity, Double price){
            super(name,quantity,price);
        Settemperature(x);
    }
}

