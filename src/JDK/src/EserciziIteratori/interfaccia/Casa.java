package EserciziIteratori.interfaccia;

public class Casa implements Misura,Giardino{
    int l1, l2, totale;

    @Override
    public int geter() {
        return totale;
    }

    @Override
    public void setter(int a, int b) {
        this.l1=a;
        this.l2=b;
    }
}
