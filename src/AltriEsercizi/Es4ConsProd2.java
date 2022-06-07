package AltriEsercizi;

import java.util.ArrayList;

public class Es4ConsProd2 {

    public static ArrayList<Integer> buffer = new ArrayList<>();

    public static class Producer extends Thread{

        @Override
        public void run() {
            System.out.println("Wow sta partendo anche questo Producer, kill me");
            while(true){
                synchronized (buffer){                                      // Dentro il for
                    for(int i=0; i<50; i++){
                        buffer.add(i);
                        System.out.println("Prodotto un Thread " + i);
                        buffer.notify();
                    }
                }
            }
        }
    }

    public static class Consumer extends Thread {
        @Override
        public void run(){
            System.out.println("Wow sta partendo anche questo Consumer, kill me");
            while(true){
                synchronized (buffer){
                    if(!buffer.isEmpty()) {
                        int temp = buffer.get(0);
                        buffer.remove(0);
                        System.out.println("Ho Consumato il Thread numero " + temp);
                    } else{
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
