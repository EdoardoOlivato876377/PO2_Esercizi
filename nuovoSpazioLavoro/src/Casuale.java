import java.util.ArrayList;
import java.util.Iterator;

public class Casuale {
    ArrayList <Integer> arr=new ArrayList<>();
    public Casuale(){
        for(int i=0;i<10;i++){
            arr.add(i*2);
        }
    }
    Iterator <Pair<Integer,Integer>> iter= Pair.pairIterator(arr.iterator());

    Iterator <Double> iter1= Es1.mapIterator(iter,(Pair<Integer,Integer> p)-> Math.sqrt(Math.pow(p.fst,2)+Math.pow(p.snd,2)));

}
