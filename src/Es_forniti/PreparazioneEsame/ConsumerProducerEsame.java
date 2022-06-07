package PreparazioneEsame;

import Patterns.ConsumerProducer;

import java.util.ArrayList;

public class ConsumerProducerEsame {

    public static ArrayList<Integer> buffer = new ArrayList<Integer>();

    public  static class Producer extends Thread{
        @Override
        public void run(){

            System.out.println("Producer Started");

            while(true){
                for(int i = 0; i<100; i++){
                    //Produce dati
                    synchronized (buffer){
                        buffer.add(i);
                        buffer.notify();
                    }
                    System.out.println("PRODUCER produced data " + i);
                }
            }
        }
    }

    public static class Consumer extends Thread{

        @Override
        public void run(){
            System.out.println("Consumer Started");

            while(true){

                boolean check;
                synchronized (buffer){
                    if (!buffer.isEmpty()){


                        //consuma dati
                        int temp = buffer.get(0);
                        buffer.remove(0);
                        System.out.println("CONSUMER consumed data " + temp);
                        //Alternativamente puoi scrivere le precedenti righe così:
                        //System.out.println("CONSUMER consumed data " + buffer.remove(0));
                    } else {
                        //Se il buffer è vuoto, va in wait
                        try{
                            buffer.wait();
                        } catch (InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    public static void main (String[] args){
        /*Thread p = new Producer();
        Thread c = new Consumer();

        p.start();
        c.start();*/
        try {

            Thread c1 = new Consumer();
            Thread p1 = new Producer();

            c1.start();
            p1.start();

            c1.join();
            p1.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
