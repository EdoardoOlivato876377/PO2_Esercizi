package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es1Iter4 {
    public static class RevArrayIterator<T> extends ArrayList<T>{
        private int step;
        Function<T,T> func;

        public RevArrayIterator(int step, Function<T,T> func) {
            this.func = func;
            this.step = step;
        }

        public Iterator<T> iterator(){
            return new Iterator<T>() {
                int pos = 0;


                @Override
                public boolean hasNext() {
                    return pos<size();
                }

                @Override
                public T next() {
                    T x = get(pos);
                    pos+= step;
                    return func.apply(x);
                }
            };
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new RevArrayIterator<>(5, (x)-> x*x);
        for (int i = 0; i<50; i++){
            a.add(i);
        }

        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){
            int t = it.next();
            System.out.println("Ho stampato " + t);
        }
    }
}
