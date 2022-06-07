package cellulare;

public class Cellulare {
    private double carica=0;//soldi
    private double num_chiamte=0;//num chimate effettuate
    public void ricarica(double unaRicarica){
        carica=carica+unaRicarica;
    }
    public void chiamata(){
        num_chiamte=carica/0.20;
    }
    public double chiama404(){
        return carica;
    }
    public double numero_chiamate_disp(){
        return num_chiamte;
    }
    public void azzera(){
        num_chiamte=0;
    }
    public double getCarica(){
        return carica;
    }
    public Cellulare(double UnaRicarica){
        carica=0;
        num_chiamte=0;

        ricarica(UnaRicarica);
        chiamata();
        chiama404();
        numero_chiamate_disp();
        //azzera(); //metodo per azzerare, se lo attivo ripulisce tutto
        getCarica();
    }
}

