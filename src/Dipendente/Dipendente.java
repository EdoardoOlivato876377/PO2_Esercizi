package Dipendente;

public class Dipendente {
    private String nome;
    private double stipendio;

    public String getName(){
        return nome;
    }
    public double getStipendio(){
        return stipendio;
    }
    public void setNuovoNome(String nuovo_nome){ //cambia il nome al dipendente
        nome=nuovo_nome;
    }
    public void setNuovoStipendio(double nuovo_stipendio){ //cambia lo stipendio al dipendente
        stipendio=nuovo_stipendio;
    }
    public void aumento(double percentuale){
        if(percentuale<=100 && percentuale>=0) {
            stipendio = stipendio+(stipendio * percentuale/100);
        }
    }
    public Dipendente(){};

    public Dipendente(String nome_dipendente,double stipendio_dipendente){
        nome=nome_dipendente;
        stipendio=stipendio_dipendente;

        getName();
        getStipendio();
    }
}
