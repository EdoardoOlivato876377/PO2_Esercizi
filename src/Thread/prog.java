package Thread;

import java.util.ArrayList;

public class prog implements Runnable{
    public prog() {
    }
    @Override
    public void run() {
        System.out.println("Stampo");
    }
    prog (Thread a){
        run();
    }
    static public void main(String [] arg){
        prog rus=new prog();
        Thread r=new Thread(rus);
        r.start();
    }
}
