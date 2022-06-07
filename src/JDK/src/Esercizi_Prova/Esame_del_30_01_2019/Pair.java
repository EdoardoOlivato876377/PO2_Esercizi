package Esercizi_Prova.Esame_del_30_01_2019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pair <A, B> {
    public final A fst;
    public final B std;
    public Pair(A x, B y){
        this.fst=x;
        this.std=y;
    }
    public static <A> Iterator <Pair<A,A>> pairIterator(Iterator <A> it) {
        return new Iterator(){
            @Override
            public boolean hasNext(){
                return it.hasNext();
            }
            @Override
            public Pair <A,A> next(){
                return new Pair <> (last, it.next());
            }
        }
    }
}
