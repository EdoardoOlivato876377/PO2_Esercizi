package AltriEsercizi;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Es11PiccolaGerarchia2 {
    public static class Babbo_Natale implements  Comparable<Babbo_Natale>{
        private int età;

        public Babbo_Natale(int età) {
            this.età = età;
        }


        @Override
        public int compareTo(@NotNull Babbo_Natale o) {
            return this.età - o.età;
        }


        @Override
        public String toString() {
            return new String(String.valueOf(età));
        }
    }

    public static class Renne extends Babbo_Natale{
        private int età;
        private int peso;
        private boolean rabbia;


        public Renne(int età, int peso, boolean rabbia) {
            super(età);
            this.peso=peso;
            this.rabbia=rabbia;
        }


        @Override
        public int compareTo(@NotNull Babbo_Natale o) {
            if(o instanceof Renne){
                int a1, a2;
                a1 = this.età;
                a2 = età;
                if (this.rabbia){
                    a1 *= 2;
                }
                if (((Renne) o).rabbia){
                    a2 += 2;
                }
                return a1-a2;
            }
            return super.compareTo(o);
        }
    }

    public static class Elfi extends Babbo_Natale {
        private int minimo_salariale;

        public Elfi(int età, int minimo_salariale) {
            super(età);
            this.minimo_salariale=minimo_salariale;
        }



        @Override
        public int compareTo(@NotNull Babbo_Natale o) {
            if (o instanceof Elfi){
                int n1, n2;
                n1 = this.minimo_salariale;
                n2 = ((Elfi) o).minimo_salariale;
                return n1-n2;
            }
            return super.compareTo(o);
        }
    }

    public static void main(String[] args) {
        List<Babbo_Natale> p = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i<10; i++){
            p.add(new Babbo_Natale((int) (Math.random()*100)));
        }

        for(int i = 0; i<10; i++){
            p.add(new Elfi((int) (Math.random()*100), 100));
        }

        for(int i = 0; i<10; i++){
            p.add(new Renne((int) (Math.random()*100), (int) (Math.random()*100), r.nextBoolean()));
        }

        Collections.shuffle(p);
        Collections.sort(p);
        for(Babbo_Natale e : p){
            System.out.println(e.età);
        }
        System.out.println("----------------------");
        Collections.shuffle(p);
        Collections.sort(p, (p1, p2) -> {
            return p1.età - p2.età;
        });
        for(Babbo_Natale e : p){
            System.out.println(e);
        }
    }
}
