package Esercizi_Prova.Thread;

public class MainThread extends Thread {
    public static void main(String [] args) throws InterruptedException {
        prog1 m=new prog1();
        m.start();
        System.out.println(m.getId()+" "+"and"+" "+m.getName());
        System.out.println(m.isAlive());
        m.stop();
    }
}
