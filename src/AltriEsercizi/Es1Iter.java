package AltriEsercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Es1Iter {
    public static class FuncStepArrayList<T> extends ArrayList<T> {
        private final int step;
        Function<T,T> f;


        public FuncStepArrayList(Integer step, Function<T, T> f) {
            this.step=step;
            this.f = f;
        }

        public Iterator<T> iterator(){
            return new Iterator<>() {
                int size1 = size()-1;
                int size2 = 0;

                @Override
                public boolean hasNext() {
                    return (step>0) ? size2<size() : size1>0;
                }

                @Override
                public T next() {
                    T x;
                    if (step>0){
                        x = get(size2);
                        size2+=step;
                    }
                    else{
                        x = get(size1);
                        size1+=step;
                    }
                    return f.apply(x);
                }
            };
        }
    }

    public static void main(String[] args) {
        List<Integer> n = new FuncStepArrayList<>(-2, (x)-> x+1 );
        for(int i = 0; i<21 ; i++){
            n.add(i);
        }
/*
        List<Integer> n2 = new FuncStepArrayList<>(2, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        });

        Iterator<Integer> y = n.iterator();
        while(y.hasNext()){
            int y1 = y.next();
            System.out.println(y1);
        }
*/
        for (int x : n) {
            System.out.println(x);
        }
    }
}
