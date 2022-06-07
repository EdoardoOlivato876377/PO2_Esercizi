package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es2MapIter5 {
    public static <A,B>Iterator<B> MapIterator(Iterator<A> it, Function<A,B> f){
        return new Iterator<B>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public B next() {
                try{
                    A a = it.next();
                    return f.apply(a);
                } catch (RuntimeException e){
                    System.err.println(e.getMessage());
                    if (hasNext()) return next();
                    else throw e;
                }
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i<34; i++){
            a.add(i);
        }

        Iterator<Double> it = MapIterator(a.iterator(), new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return (double) integer+1;
            }
        });
        while(it.hasNext()){
            double b = it.next();
            System.out.println("Prendo: " + b);
        }

    }
}
