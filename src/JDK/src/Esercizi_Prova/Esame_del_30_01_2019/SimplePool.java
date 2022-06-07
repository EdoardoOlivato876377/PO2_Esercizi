package Esercizi_Prova.Esame_del_30_01_2019;

import java.util.concurrent.LinkedBlockingDeque;

public class SimplePool implements BasicPool{
    private BlockingQueue<T> q = new LinkedBlockingDeque<>();
    @Override
    void add(T x){
        q.add(x);
    }
    @Override
    R aquire() throws InterruptedException{
        return q.take();
    }
    @Override
    void release(R x){
        q.add(x);
    }
}
