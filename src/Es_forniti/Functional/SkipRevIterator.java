package Functional;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SkipRevIterator {
    public static class SkipRevArrayList<T> extends ArrayList<T> {

        private int l;

        public SkipRevArrayList(int l){
            this.l = l;
        }
        @NotNull
        @Override
        public Iterator<T> iterator(){
            return new Iterator<T>() {
                private int pos1 = size()-1;
                private int pos2 = size()-1;

                @Override
                public boolean hasNext() {
                    return pos2>=0;
                }

                @Override
                public T next() {
                    if (pos2==pos1) {
                        pos2 = pos1 - l;
                        return get(pos1);
                    }
                    else{
                        pos1=pos2;
                        pos2=pos2-l;
                        return get(pos1);
                    }
                }
            };
        }
    }
    public static void main(String[] args){
        List<Integer> a1 = new SkipRevArrayList<>(4);
        for (int i=0; i<31; i++){
            a1.add(i);
        }

        Iterator<Integer> a2 = a1.iterator();
        while(a2.hasNext()){
            int n = a2.next();
            System.out.println(n);
        }
    }
}
