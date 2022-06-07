package Esercizi_Prova.DesignPattern;

public class Singleton {
    private static Singleton s1=new Singleton();
    public static Singleton create(){
        return s1;
    }
}

