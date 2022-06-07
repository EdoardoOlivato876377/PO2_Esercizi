package Thread;

public class Main extends Thread{
    public static void main(String [] args){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.run();
        try {
            thread1.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.run();
        try{
            thread2.sleep(100000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t1.run();
        t1.notify();
    }
}
