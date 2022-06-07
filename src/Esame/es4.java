package Esame;

// Fare una funzione che dato un Iterator su T, ed una funzione da T ad S, produce un iteratore tuo
// MultiThread
// Eccezioni solo a runtime
// A runtime recuperi informazione sui tipi
// Polimorfismo del subtyping e polimorfismo sui generics (parametrico)
// Parametrico: Ci permette di prendere tipi, dei tipi sconosciuti, poi, quando andremo a richiamare quel metodo gli verrà fornito il metodo effettivo che vogliamo dare


import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;

public class es4 {
    public static <T, S> Iterator<Supplier<S>> map(Iterator<T> it, Function<T,S> f){
        return new Iterator<Supplier<S>>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public Supplier<S> next() {
                Supplier<S>[] supp = new Supplier[1];
                S val = f.apply(it.next());
                new Thread(()->{
                    supp[0] = new Supplier<S>() {
                        @Override
                        public S get() {
                            return val;
                        }
                    };
                }).start();
                return supp[0];
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add(i);
        }

        Iterator<Supplier<Integer>> iterator = map(arr.iterator(), new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        });

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
