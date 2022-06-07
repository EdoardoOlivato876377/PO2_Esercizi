package Esercizi_Prova.Esame_del_30_01_2019;

import java.util.concurrent.LinkedBlockingDeque;
/*
public class AutoPool implements Pool{
    private BlockingQueue<T> q = new LinkedBlockingDeque<>();
    @Override
    public void add(T x) {
        q.add(x);
    }

    @Override
    public Object acquire() throws InterruptedException {
        T r = q.take();
        return new Resource<>() {

            @Override
            public T get() {
                System.out.println(String.format("acquired: %s", r));
                return r;
            }

            @Override
            public void release() {
                System.out.println(String.format("released: %s", r));
                add(r);
            }

            @SuppressWarnings("deprecation")
            @Override
            public void finalize() {
                release();
            }
        };
    }

    @Override
    public void release(Resource <T> x) {
        q.relase(x)
    }
}
*/
