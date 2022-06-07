package Prova_Array;
import java.util.ArrayList;

public class Test_EliminaDuplicati {
    public static void main(String [] arg){
        EliminaDuplicati primoOgg=new EliminaDuplicati();
        ArrayList prova=new ArrayList();
        prova.add(1);
        prova.add(2);
        prova.add(3);
        prova.add(3);
        prova.add(3);
        prova.add(2);
        prova.add(9);
        primoOgg.eliminaduplicati(prova);
    }
}
