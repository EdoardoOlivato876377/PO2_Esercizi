package Esercizi_Prova;

public class MainOperazioni {
    public static void main(String [] argv){
        int x=3;
        int y=4;
        Somma somma= new Somma() {
            @Override
            public int somma(int x, int y) {
                int h = x + y;
                System.out.println("fatto");
                return h;
            }
        };
        Runnable s2= ()-> {
            System.out.println("ciao");
        };
    }
}
