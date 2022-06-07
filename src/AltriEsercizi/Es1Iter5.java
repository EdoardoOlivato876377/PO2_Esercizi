package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es1Iter5 {
    public static class StepIterator<T> extends ArrayList<T>{
        int step;
        Function<T,T> func;


        public StepIterator(int step, Function<T, T> func) {
            this.step=step;
            this.func = func;
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                int pos = 0;

                @Override
                public boolean hasNext() {
                    return pos<size();
                }

                @Override
                public T next() {
                    T a = get(pos);
                    pos= pos+ step;
                    return func.apply(a);
                }
            };
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new StepIterator<>(2, (x) -> x+5);
        for (int i= 0; i< 50; i++){
            a.add(i);
        }

        for (int x:a){
            System.out.println(x);
        }
    }
}