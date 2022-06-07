package AltriEsercizi;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Es12EsercizioSpanò {
    public static class RandomLists implements Iterable<List<Integer>> {
        private int n;
        private int size;

        public RandomLists(int n, int size) {
            this.n = n;
            this.size = size;
        }

        public Iterator<List<Integer>> iterator() {
            return new Iterator<>() {
                @Override
                public boolean hasNext() {
                    return size>0;
                }

                @Override
                public List<Integer> next() {
                    List<Integer> c = new ArrayList<>();
                    int a = (int) ((Math.random()*n)+1);
                    for( int i = 0; i<a; i++){
                        c.add((int) (Math.random()*n)+1);                             //new Random().nextInt(); maniera alternativa
                    }
                    size--;
                    return c;
                }
            };
        }
    }


    public static void main(String[] args) {

        // n: elementi prodotti tanti quanti sono il primo
        // size: lunghezza massima della nostra list
        for(List<?> c : new RandomLists(10, 20)){           // a destra dei : deve essere un'espressione che deve essere come minimo un iterable
            System.out.println("----------------------------------");
            System.out.println(c);
        }
    }
}
