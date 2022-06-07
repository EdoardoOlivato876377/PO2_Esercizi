package Esercizi_Prova.MaxMinCoppia;

import java.util.ArrayList;
import java.util.List;

public class Trova {
    List <Integer> l=new ArrayList<Integer>();
    public Pair max_min(){
        int max=l.get(0);
        int min=max;
        for(int i=1;i<l.size();i++){
            if(l.get(i)>=max){
                max=l.get(i);
            }
            if(l.get(i)<=min){
                min=l.get(i);
            }
        }
        Min Min=new Min(min);
        Max Max=new Max(max);
        Pair <Min,Max> p=new Pair<Min,Max>(Min,Max);
        System.out.println(min);
        System.out.println(max);
        return p;
    }


    Trova(){
        l.add(20);
        l.add(5);
        l.add(10);
        l.add(20);
    }
}
