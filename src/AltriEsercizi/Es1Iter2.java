package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es1Iter2 {
    public static class Es2<T> extends ArrayList<T>{
        private int step;
        Function<T,T> fun;


        public Es2(int step, Function<T,T> f) {
            this.step = step;
            this.fun = f;
        }

        public Iterator<T> iterator(){
            return new Iterator<T>() {
                int pos = 0;

                @Override
                public boolean hasNext() {
                    return pos<size()-1;
                }

                @Override
                public T next() {
                    T x = get(pos);
                    pos += step;
                    return fun.apply(x);
                }
            };
        }

        public static void main(String[] args) {
            List<Integer> a = new Es2<Integer>(4, x -> x*x);
            for ( int i = 0; i<50; i++ ){
                a.add(i);
            }

            Iterator<?> it = a.iterator();
            while (it.hasNext()){
                Object x = it.next();
                System.out.println(x);
            }
        }
    }
}
