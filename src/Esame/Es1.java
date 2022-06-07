package Esame;
// Generics -> Tolti in compilazione
// ArrayList, tipo parametrico
// Classe senza il suo tipo parametrico (quando la vuole ma tu la usi senza)

// Se tipo parametrico non specificato: diventa object, con constraint diventa un constraint
// public
// private E e; Uso improprio dei tipi parametrici, bisognerebbe specificare il tipe argument, accetta per motivi di retrocompatibilità

// extends = costraint


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

// 10 collections casuali
// 20 lunghezza di ogni collections
public class Es1 {
    public static class MyClass<E extends Number>{
        private E e;
    }

    public static class RandomCollections implements Iterable<Collection<?>> {
        private int n;
        private int size;


        public RandomCollections(int n, int size) {
            this.n = n;
            this.size = size;
        }

        public Iterator<Collection<?>> iterator() {
            return new Iterator<Collection<?>>() {
                @Override
                public boolean hasNext() {
                    return size>0;
                }

                @Override
                public Collection<?> next() {
                    Collection<Integer> c = new ArrayList<Integer>();
                    int a = (int) ((Math.random()*n));
                    for( int i = 0; i<a; i++){
                        c.add((int) ((Math.random()*n)));           //new Random().nextInt();
                    }
                    size--;
                    return c;
                }
            };
        }
    }


    public static void main(String[] args) {
        MyClass e;

        for(Collection<?> c : new RandomCollections(10, 20)){           // a destra dei : deve essere un'espressione che deve essere come minimo un iterable
            System.out.println("----------------------------------");
            System.out.println(c);

        }
    }


}
