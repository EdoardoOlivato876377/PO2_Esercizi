import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class Prog extends Thread{
    public void Print(ArrayList <Integer> c){
        Iterator <Integer> iter=c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public synchronized void run() {
       ArrayList<Integer> coda= new ArrayList<>();
       coda.add(10);
       coda.add(20);
       Print(coda);
    }
}
