package Esercizi_Prova.IteratoreInverso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayBack2<T> extends ArrayList<T> {

    public Iterator <T> originalIterator(){
        return super.iterator();
    }

    public Iterator <T> iter(){
        return new Iterator<T>() {
            int index=ArrayBack2.this.size()-1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public T next() {
                return ArrayBack2.this.get(index--);
            }
        };
    }
    public <X> Iterator <X> reverseIterator2(Iterator <X> it){
        List<X> ciao=new ArrayList <X>();
        while(it.hasNext()){
            ciao.add(0, it.next());
        }
        return ciao.iterator();
    }
}
