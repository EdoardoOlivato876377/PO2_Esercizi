package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es2MapIter3 {
    public static <A, B>Iterator<B> MapIterator(Iterator<A> it, Function<A, B> f){
        return new Iterator<>() {
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
        for (int i = 0; i<20; i++){
            l.add(i);
        }

        Iterator<Integer> it = MapIterator(l.iterator(), n ->  n*n);
        while(it.hasNext()){
            double x = it.next();
            System.out.println(x);
        }
    }
}
