package EserciziIteratori.Carico;

public class Prodotto {
    private double quantità, prezzo;
    private String nomeprodotto;
    public double getquantità(){
        return quantità;
    }
    public double qetprezzo(){
        return prezzo;
    }
    public String getNomeprodotto(){
        return nomeprodotto;
    }
    public void setNomeprodotto(String n){
        this.nomeprodotto=n;
    }

    public void setQuantità(double x){
        this.quantità=x;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    Prodotto(String name,int quantity, Double price){
        setNomeprodotto(name);
        setPrezzo(price);
        setQuantità(quantity);
    }
}

