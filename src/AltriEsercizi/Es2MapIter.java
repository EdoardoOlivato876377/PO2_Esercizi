package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es2MapIter {
    public static <A, B> Iterator<B> MapIter(Iterator<A> it, Function<A,B> f){
        return new Iterator<B>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public B next() {
                A a = it.next();
                return f.apply(a);
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i= 0; i<20; i++){
            l.add(i);
        }

        Iterator<Double> it = MapIter(l.iterator(), n -> (double) n);
        while(it.hasNext()){
            double x = it.next();
            System.out.println(x);
        }
    }
}
