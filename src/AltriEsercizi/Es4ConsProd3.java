package AltriEsercizi;

import java.util.ArrayList;

public class Es4ConsProd3 {

    public static ArrayList<Integer> buffer = new ArrayList<>();


    public static class Producer extends Thread{

        @Override
        public void run() {
            System.out.println("Inizia il Producer");
            while(true){
                for(int i=0; i<100; i++){
                    synchronized (buffer){
                        buffer.add(i);
                        System.out.println("Ho prodotto: " + i);
                        buffer.notify();
                    }
                }
            }
        }
    }

    public static class Consumer extends Thread{

        @Override
        public void run() {
            System.out.println("Inizia il Producer");
            while(true){
                synchronized (buffer){
                    if(!buffer.isEmpty()) {
                        int temp = buffer.get(0);
                        buffer.remove(0);
                        System.out.println("Ho consumato: " + temp);
                    } else{
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        try{
            Producer a = new Producer();
            Consumer b = new Consumer();

            a.start();
            b.start();

            a.join();
            b.join();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
