package Esercizi_Prova.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String [] arg){
        List<Integer> l1=new ArrayList<>();
        conLista l=new conLista();
        l1.add(1);
        l1.add(2);
        l.print(l1);
        ArrayList<Integer> l2=new ArrayList<>();
        conArray ll=new conArray();
        l2.add(1);
        l2.add(2);
        ll.print(l2);
        HashMap <Integer,Integer> h=new HashMap<>();
        h.put(3,4);
        System.out.println(h.get(3));
    }
}
