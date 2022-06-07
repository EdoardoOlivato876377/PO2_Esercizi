package Esercizi_Prova.conta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class conLista {
    public void print(List l1){
        Iterator<Integer> l= l1.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
    }
}
