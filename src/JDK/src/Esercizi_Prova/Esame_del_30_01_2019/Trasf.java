package Esercizi_Prova.Esame_del_30_01_2019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Trasf {

    public void add(){
        List<Integer> interi=new ArrayList<>();
        Random x=new Random();
        final int size=Math.abs(x.nextInt()%50)+1;
        for(int i=0;i<size;i++){
            interi.add(Math.abs(x.nextInt()%1000));
        }

       //Iterator <Pair<Integer, Integer>> cateti=pairIterator(interi.iterator());
        // Iterator <Double> ipotenuse=mapIterator(cateti, (Pair<Integer,Integer> p)->{Math.sqr(Math.pow(fst,2)+Math.pow(sdt,2))});
    }
}
