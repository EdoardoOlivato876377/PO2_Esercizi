package Caldaie;

public class Riparazioni {
    private String indirizzo;
    private int priorità; //numero non negativo
    public void setPriorità(int prior){
        if(prior>0){
            priorità=prior;
        }else{
            System.out.println("Inserimento priorità negativa");
        }
    }
    public void setIndirizzo(String ind){
        indirizzo=ind;
    }
    public String getIndirizzo(){
        return indirizzo;
    }
    public int getPriorità(){
        return priorità;
    }
    public Riparazioni(int priorità, String indirizzo){
        setPriorità(priorità);
        getPriorità();
        setIndirizzo(indirizzo);
        getPriorità();
    }
}
