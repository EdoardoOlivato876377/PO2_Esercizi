package AltriEsercizi;

import java.util.*;

public class Es9Trifunction2 {

    @FunctionalInterface
    private interface Trifunction<R, A, B, C>{
        R apply(A a, B b, C c);
    }

    public static <R, A, B, C>Iterator<R> TriMapIterator(Iterator<A> a, Iterator<B> b, Iterator<C> c, Trifunction<R, A, B, C> trifunc){
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return a.hasNext() && b.hasNext() && c.hasNext();
            }

            @Override
            public R next() {
                A a1 = a.next();
                B b1 = b.next();
                C c1 = c.next();
                return trifunc.apply(a1, b1, c1);
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> c = new LinkedList<>();
        Collection<Integer> b = new ArrayList<>();


        for (int i=0; i<= 2; i++){
            a.add((int) (Math.random()*10));
            b.add((int) (Math.random()*10));
            c.add((int) (Math.random()*10));
        }

        for (int i=0; i<= 2; i++) {
            System.out.println(a.get(i) + " |||| " + c.get(i));
        }

        for (int x: b) {
            System.out.println(x);
        }

        Iterator<Integer> it = TriMapIterator(a.iterator(), c.iterator(), b.iterator(), new Trifunction<Integer, Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2, Integer integer3) {
                return integer + integer2 + integer3;
            }
        });
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
    }
}
