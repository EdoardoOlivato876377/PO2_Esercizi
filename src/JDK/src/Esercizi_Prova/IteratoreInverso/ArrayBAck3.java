package Esercizi_Prova.IteratoreInverso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayBAck3 <T> extends ArrayList {
    public Iterator <T> outIterator(){
        return super.iterator();
    }

    public Iterator <T> iter(){
        return new Iterator<T>() {
            int index=ArrayBAck3.this.size()-1;
            @Override
            public boolean hasNext(){
                return index>=0;
            }
            @Override
            public T next(){
                return (T) ArrayBAck3.this.get(index--);
            }
        };
    }

    public <X> Iterator <X> iteratorinverso(Iterator <X> it){
        List<X> ciao=new ArrayList<>();
        while(it.hasNext()){
            ciao.add(0,it.next());
        }
        return ciao.iterator();
    }
}
