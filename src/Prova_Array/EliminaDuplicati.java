package Prova_Array;
import java.util.ArrayList;

public class EliminaDuplicati{
    public void eliminaduplicati(ArrayList <Integer> a) {
        int i = 0, j = 1;
        if(a.isEmpty())
            System.out.println("You have an empty array, put inside something and reload");
        while (i < a.size() - 1) {
            while (j < a.size()) {
                if (a.get(i) == a.get(j)) {
                    a.remove(i);
                } else
                    j++;
            }
            i++;
        }
    }
}
