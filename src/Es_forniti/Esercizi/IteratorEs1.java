package Esercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEs1 {
    public static class ArrayIter<T> extends ArrayList<T> {
        protected int step;

        public ArrayIter(Integer a){
            this.step = a;
        }

        public Iterator<T> iterator(){
            return new Iterator<T>() {
                private int pos = 0;

                @Override
                public boolean hasNext() {
                    return pos<ArrayIter.this.size();
                }

                @Override
                public T next() {
                    pos += step;
                    return get(pos);
                }
            };
        }

    }

    public static void main(String[] args){
        List<Integer> l = new ArrayIter<Integer>(2);
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
