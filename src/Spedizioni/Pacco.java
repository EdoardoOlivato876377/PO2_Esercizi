package Spedizioni;

public class Pacco {
    private String codice;
    private int peso;
    private String destinazione;

    public void setCodice(String cod){
        codice=cod;
    }
    public String getCodice(){
        return codice;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
    public int getPeso(){
        return peso;
    }
    public void setDestinazione(String dest){
        codice=dest;
    }
    public String getDestinazione(){
        return destinazione;
    }
    public Pacco(String c,int p, String d){
        setCodice(c);
        setDestinazione(d);
        setPeso(p);
        getCodice();
        getDestinazione();
        getPeso();
    }
}
