package AltriEsercizi;

import java.util.*;

public class Es9Trifunction {
    @FunctionalInterface
    private static interface Trifunction<A , B , C , D>{
        public D apply(A a , B b , C c);
    }
    public static <A , B , C , R> Iterator<R> trimapiterator(Iterator<A> a , Iterator<B> b , Iterator<C> c , Trifunction<A , B , C , R> trifunction){
        return new Iterator<R>() {

            @Override
            public boolean hasNext() {
                return a.hasNext() && b.hasNext() && c.hasNext();
            }

            @Override
            public R next() {
                A debug1 ; B debug2 ; C debug3;
                debug1 = a.next();
                debug2 = b.next();
                debug3 = c.next();
                System.out.println(debug1);
                System.out.println(debug2);
                System.out.println(debug3);
                return trifunction.apply(debug1 , debug2 , debug3);
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> f  = new ArrayList <>();
        LinkedList<Integer> a = new LinkedList<>();
        Collection<Integer> p = new ArrayList <>();
        int checksum = 0 ; //TODO : Debug only

        Random r = new Random();
        for(int i = 0 ; i < 10 ; i++){
            int arg = Math.abs(r.nextInt() % 100);
            System.out.println(arg);
            checksum+=arg;
            f.add(arg);
            a.add(arg);
            p.add(arg);
        }

        Iterator<Integer> n = trimapiterator(f.iterator() , a.iterator() , p.iterator() , (x , y , z) -> {
            return x + y + z;
        });

        Iterator<Integer> n2 = trimapiterator(f.iterator(), a.iterator(), p.iterator(), new Trifunction<Integer, Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2, Integer integer3) {
                return integer + integer2 + integer3;
            }
        });

        int sum = 0 ;
        while (n.hasNext()){
            sum+=n.next();
        }

        System.out.println(sum);
        System.out.println(checksum);
        System.out.println(sum == checksum);        //FIXME: ritorna sempre false
    }
}
