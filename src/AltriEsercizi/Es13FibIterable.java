package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Es13FibIterable {
    public static class Fibonacci implements Iterable<Integer> {

        private final List<Integer> list;
        private final int iteractions;

        public Fibonacci(int n){
            list = new ArrayList<>(); //subsumo (il generic è implicito)
            iteractions=n;
            list.add(0);
            list.add(1);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {

                private int pos = 2;

                @Override
                public boolean hasNext() {
                    return pos<iteractions;
                }

                @Override
                public Integer next() {
                    list.add(list.get(pos-1)+list.get(pos-2));
                    return list.get(pos++);
                }
            };
        }
    }

    public static void main(String[] args) {
        for(Integer c : new Fibonacci(7)){           // a destra dei : deve essere un'espressione che deve essere come minimo un iterable
            System.out.println("----------------------------------");
            System.out.println(c);
        }
    }
}
