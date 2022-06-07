package TestCostruttori;

public class Macchina extends Veicoli{
    public void numero_ruote(int n){
        int numeroruote=n;
        System.out.println(n);
    }
    public Macchina(int x, String y, int n) {
        super(x, y);
        numero_ruote(n);
    }
}
