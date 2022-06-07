package Esame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class SumIterable {
    public static class SummableArray implements Iterable<Integer> {
        private List<Integer> list;

        public SummableArray(){
            list = new ArrayList<>();
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return list.size()!=0;
                }

                @Override
                public Integer next() {
                    return list.remove(0);
                }
            };
        }
    }

    public static <T> T sum(Iterable<T> l, T acc, BiFunction<T, T, T> plus){
        T total = acc;
        Iterator<T> it = l.iterator();
        while(it.hasNext())
            total = plus.apply(total, it.next());
        return total;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Ciao", "come", "stai");
        System.out.println(sum(list, "", (x,y)->(x+" "+y)));
    }
}
