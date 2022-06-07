package AltriEsercizi;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Es7ProducerConsumerBL {
    private static final BlockingQueue<Integer> l = new LinkedBlockingQueue<>();

    public static class Producer extends Thread {
        @Override
        public void run() {
            System.out.println("producer started");
            Random rnd = new Random();
            while(true){
                l.add(rnd.nextInt() % 100);
            }
        }
    }

    public static class Consumer extends Thread {

        @Override
        public void run() {
            System.out.println("consumer started");
            while (true){
                try {
                    int n = l.take();
                    System.out.printf("Consumer: %d\n", n);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        try{
            Thread c1 = new Consumer();
            Thread p1 = new Producer();

            c1.start();
            p1.start();

            c1.join();
            p1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
