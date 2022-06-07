package Esame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class IteratorEs {
    public static class ArrayIter<T> extends ArrayList<T> {
        protected int step;
        Function<T, T> f;

        public ArrayIter(Integer step,Function<T, T> f) {
            this.step=step;
            this.f = f;
        }


        public Iterator<T> iterator(){
            return new Iterator<T>() {
                private int pos = 0;

                @Override
                public boolean hasNext() {
                    return pos<ArrayIter.this.size() -1;
                }

                @Override
                public T next() {
                    System.out.println("la size è: " + ArrayIter.this.size());
                    pos += step;
                    return f.apply(get(pos));
                }
            };
        }

    }

    public static void main(String[] args){
        List<Integer> l = new ArrayIter<Integer>(2, (x) -> x*2);
        for (int i = 0; i < 21; ++i){
            l.add(i);
        }

        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
    }
}
