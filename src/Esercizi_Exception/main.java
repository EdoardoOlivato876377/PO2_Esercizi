package Esercizi_Exception;
import java.util.ArrayList;

public class main {
    public static void main(String [] arg) throws Exception {
        int numero=3;
        ArrayList a=new ArrayList();
        Prova1 p1=new Prova1(numero,a);
        a.add(1);
        a.add(4);
        a.add(6);
        a.add(9);
        a.add(5);
        a.add(0);
        p1.individua(numero,a);
    }
}
