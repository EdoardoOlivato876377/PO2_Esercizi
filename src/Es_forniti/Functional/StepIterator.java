package Functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

public class StepIterator {
    public static class StepArrayList<T> extends ArrayList<T> {
        private final int step;
        Function<T,T> fun;

        public StepArrayList (int step, Function<T,T> fun){
            this.step=step;
            this.fun=fun;
        }

        @Override
        public Iterator<T> iterator(){
            return new Iterator<T>() {
                private int pos = step>0 ? 0 : StepArrayList.this.size()-1;

                @Override
                public boolean hasNext() {
                    if(step>0)
                        return pos < StepArrayList.this.size();
                    else
                        return pos>=0;
                }

                @Override
                public T next() {
                    T b = StepArrayList.this.get(pos);
                    pos+=step;
                    return fun.apply(b);
                }
            };
        }
    }

    public static void main(String[] args) {
        StepArrayList<Integer> a = new StepArrayList<>(4, (n)->(n*2));
        for(int i=0; i<=20; i++){
            a.add(i);
            System.out.print(i + " - ");
        }
        System.out.println();
        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" - ");
        }
    }
}

