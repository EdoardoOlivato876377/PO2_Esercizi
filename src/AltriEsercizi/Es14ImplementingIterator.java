package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Es14ImplementingIterator {
    public static class Test2<T> implements Iterator<T> {           // implementiamo Iterator
        private final ArrayList<T> l;
        private int pos;
        private static Random rand = new Random();


        public Test2 (ArrayList<T> l){
            this.l = l;
            this.pos = l.size() - 1;
        }

        @Override
        public boolean hasNext() {
            int position = pos;
            while(position>=0){
                if((int)(l.get(position))%2==0)
                    return true;
                position--;
            }
            return false;
        }

        @Override
        public T next() {
            while((int)(l.get(pos))%2!=0){
                pos--;
            }
            return l.get(pos--);
        }


        public static void main (String[] args){
            ArrayList<Integer> l = new ArrayList<>(10);

            for(int i=0; i<10; i++){
                l.add(rand.nextInt(100));
            }

            Test2<Integer> RevTest = new Test2<Integer>(l);

            for(int i=0; i<10; i++){
                System.out.print(l.get(i)+" - ");
            }

            System.out.println();

            while (RevTest.hasNext()){
                int n = RevTest.next();
                System.out.print(n+" - ");
            }

        }
    }
}
