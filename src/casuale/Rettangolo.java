package casuale;
public class Rettangolo {
    int base;
    int altezza;
    int ascissa;
    int ordinata;

    public Rettangolo(){
        base=1;
        altezza=1;
        ascissa=0;
        ordinata=0;
    }

    public Rettangolo(int unaBase, int unAltezza, int unAscissa, int unOrdinata){
        base=unaBase;
        altezza=unAltezza;
        ascissa=unAscissa;
        ordinata=unOrdinata;
    }
    public int Base(){
        return base;
    }
    public int Altezza(){
        return altezza;
    }
    public int Ascissa(){
        return ascissa;
    }
    public int Ordinata(){
        return ordinata;
    }
    public void setBase(int nuovaBase){
        base=nuovaBase;
    }
    public void setAltezza(int nuovaAltezza){
        altezza=nuovaAltezza;
    }
    public void setAscissa(int nuovaAscissa){
        ascissa=nuovaAscissa;
    }
    public void setOrdinata(int nuovaOrdinata){
        ordinata=nuovaOrdinata;
    }
    public void traslazione(int trX, int trY){
        ascissa=ascissa+trX;
        ordinata=ordinata+trY;
    }
    public int perimetro(){
        int perimetro;
        perimetro=(altezza+base)*2;
        return perimetro;
    }
    public int Area(){
        return base*altezza;
    }
}
