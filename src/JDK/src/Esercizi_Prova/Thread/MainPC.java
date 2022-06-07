package Esercizi_Prova.Thread;

import java.util.ArrayList;
import java.util.Iterator;

public class MainPC{
    public static ArrayList<Integer> buffer=new ArrayList<Integer>();
    public static class Producer extends Thread{
        @Override
        public synchronized void run() {
            super.run();
            buffer.add(5);
            buffer.add(6);
            buffer.add(7);
            System.out.println("Sono dentro il Produttore");
        }
    }

    public static class Consumer extends Thread{
        @Override
        public synchronized void run(){
            Iterator <Integer> it= buffer.iterator();
            super.run();
            while(it.hasNext()){
                buffer.remove(it);
                buffer.remove(it);
                buffer.remove(it);
                System.out.println("Sono dentro il Consumatore");
            }
        }
    }

    public static void main(String [] arg){
        Producer p=new Producer();
        Consumer c=new Consumer();
        try{
            p.start();
            c.start();
        }catch(Exception e){
            System.out.println("Error"+e);
        }
        try {
            p.wait(10);
            c.wait(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.stop();
        c.stop();
    }
}
