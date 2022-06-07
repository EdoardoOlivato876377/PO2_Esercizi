package Esercizi_Prova;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintGiorno {
    public PrintGiorno(Giorno x){
        this.print(x);
    }
    public void print(Giorno x){
        System.out.println((x));
    }
    public interface Runnable{
        void run();
    }
    public interface Consumer <A>{
        void accept(A x);
    }
    public interface Supplier <A>{
        A get();
    }
    public interface Function <A,B>{
        B applay(A x);
    }
}
