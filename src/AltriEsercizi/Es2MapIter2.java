package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es2MapIter2 {
    public static <A,B> Iterator<B> MapIter(Function<A,B> it, Iterator<A> b){
        return new Iterator<B>() {
            @Override
            public boolean hasNext() {
                return b.hasNext();
            }

            @Override
            public B next() {
                try{
                    A a = b.next();
                    return it.apply(a);
                } catch (RuntimeException e){
                    System.err.println(e.getMessage());
                    if (hasNext())
                        return next();
                    else
                        throw e;
                }
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        for(int i= 0; i<20; i++){
            a1.add(i);
        }

        Iterator<Double> it = MapIter((x)-> (double) x*x, a1.iterator());
        while(it.hasNext()){
            double x = it.next();
            System.out.println(x);
        }
    }
}
