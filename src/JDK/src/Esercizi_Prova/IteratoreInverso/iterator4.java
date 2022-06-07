package Esercizi_Prova.IteratoreInverso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator4 <T> extends ArrayList<T> {



    public Iterator <T> iteratore (){
        return super.iterator();
    }

    public Iterator <T> it(){
        return new Iterator<T>() {
            private int index=iterator4.this.size()-1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public T next() {
                return iterator4.this.get(index--);
            }
        };
    }

    public <X> Iterator <X> iteratore_inverso(Iterator <X> its){
        List<X> array=new ArrayList<>();
        while(its.hasNext()){
            array.add(0,its.next());
        }
        return array.iterator();
    }
}
