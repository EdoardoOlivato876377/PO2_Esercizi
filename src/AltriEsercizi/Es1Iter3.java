package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

public class Es1Iter3 {
    public static class Es3<T> extends ArrayList<T>{
        private final int step;
        Function<T,T> func;

        public Es3(int step, Function<T,T> func) {
            this.step = step;
            this.func = func;
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                int pos = 0;

                @Override
                public boolean hasNext() {
                    return step>3? pos<size() : pos<20;
                }

                @Override
                public T next() {
                    T x = get(pos);
                    pos = pos + step;
                    return func.apply(x);
                }
            };
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new Es3<>(2, x-> x*2);
        for (int i = 0; i<30; i++){
            a.add(i);
        }

        Iterator<?> it = a.iterator();
        while(it.hasNext()){
            Object x = it.next();
            System.out.println(x);
        }
    }
}
