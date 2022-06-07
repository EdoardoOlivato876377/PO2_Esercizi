package Esame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class MapIterator {
    public static <A,B> Iterator<B> MapIter123(Iterator<A> it, Function<A,B> f){
        return new Iterator<B>(){

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public B next() {
                try{
                    // A a = it.next();
                    return f.apply(it.next());
                } catch (RuntimeException e){
                    System.err.println(String.format("Exception caught: %s", e.getMessage()));
                    if (hasNext())
                        return next();
                    else
                        throw e;
                }
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i= 0; i<20; i++){
            l.add(i);
        }

        Iterator<Double> it = MapIter123(l.iterator(), n -> (double) n);
        while(it.hasNext()){
            double x = it.next();
            System.out.println(x);
        }
    }
}
