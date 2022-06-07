package Esercizi_Prova.Domande;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class main{

    public static void main(String [] argv) {

        List<Humanoid> l = new ArrayList<>();
        Humanoid a = new Elf(10, 8), b = new Humanoid(8), c = new Humanoid(12);
        l.add(a); l.add(b); l.add(c);
        sort(l);
        for(int i=0;i<l.size();i++){
            System.out.println(i);
            System.out.println(l.get(i).strength);

        }
    }
}
