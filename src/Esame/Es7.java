package Esame;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Es7 {
    public static class Piatti implements Comparable<Piatti>{
        private int prezzo;

        public Piatti(int prezzo) {
            this.prezzo = prezzo;
        }


        @Override
        public int compareTo(@NotNull Piatti o) {
            return this.prezzo - o.prezzo;
        }

        @Override
        public String toString() {
            return new String(String.valueOf(prezzo));
        }
    }


    public static class Primi extends Piatti {
        private int prezzo;
        private boolean diCarne;

        public Primi(int prezzo, boolean b) {
            super(prezzo);
            this.prezzo=prezzo;
            this.diCarne = b;
        }


        @Override
        public int compareTo(@NotNull Piatti o) {
            if(o instanceof Primi){
                int a, b;
                a = this.prezzo;
                b = o.prezzo;
                if (this.diCarne)
                    a*=2;
                if (((Primi) o).diCarne)
                    b += 2;
                return a - b;
            }
            else{
                return super.compareTo(o);
            }
        }
    }

    public static class Secondi extends Piatti{
        private String name;


        public Secondi(int prezzo, String name) {
            super(prezzo);
            this.name = name;
        }

        @Override
        public int compareTo(@NotNull Piatti p) {
            if (p instanceof Secondi){
                int n1, n2;
                n1 = SumName(this);
                n2 = ((Secondi) p).SumName((Secondi) p);
                return n1-n2;
            } else
                return super.compareTo(p);
        }

        private int SumName(Secondi s) {
            int sumname = 0;
            for(int i = 0; i<name.length(); i++){
                sumname += (int)name.charAt(i);
            }
            return sumname;
        }
    }

    public static void main(String[] args) {
        List<Piatti> p = new LinkedList<>();
        Random r = new Random();

        for (int i = 0; i < 3; i++){
            p.add(new Piatti(Math.abs(r.nextInt()%50)));
        }

        for (int i = 0; i < 3; i++){
            p.add(new Secondi(Math.abs(r.nextInt()%100), ""));
        }

        for (int i = 0; i < 3; i++){
            p.add(new Primi(Math.abs(r.nextInt()%50), r.nextBoolean()));
        }

        Collections.shuffle(p);
        Collections.sort(p);
        for(Piatti e : p){
            System.out.println(e);
        }
        System.out.println("--------------");
        Collections.shuffle(p);
        Collections.sort(p, (p1, p2)-> {
            return p1.prezzo - p2.prezzo;
        });
        for(Piatti e : p){
            System.out.println(e);
        }
    }
}
