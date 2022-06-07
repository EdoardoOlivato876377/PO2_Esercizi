package Esercizi_Prova.Generics;

public class Edificio extends Casa{
    private int metriquadrati;
    public int getmetriquadrati(){
        return metriquadrati;
    }
    public void setMetriquadrati(int x){
        metriquadrati=x;
    }
    public Edificio(int metri){
        super(metri);
        setMetriquadrati(metri);
    }
}
