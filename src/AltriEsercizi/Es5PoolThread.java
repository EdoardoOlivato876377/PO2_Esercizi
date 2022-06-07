package AltriEsercizi;

import Esame.Es2;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Es5PoolThread {
    private final List<PooledThread> pool = new ArrayList<>();
    private static final long TimeoutTime = 5;

    public void ThreadPool(int prespawn){
        new Es2.ThreadPool();
        for ( ; prespawn>0; prespawn -- ){
            this.pool.add(new PooledThread(
                    () -> {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            ));
        }
    }



    private static class PooledThread extends Thread{
        public long LastUsed= System.currentTimeMillis();
        private Runnable runnable;

        public PooledThread(Runnable r) {
            this.runnable = r;
        }

        public void setRunnable(Runnable r){
            runnable = r;
        }


        @Override
        public void run() {
            while(true){
                try {
                    runnable.run();
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println(super.getId() + " returned exception " + e);
                }

                LastUsed = System.currentTimeMillis();

                try{
                    runnable.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @NotNull
    public Thread acquire(@NotNull Runnable r) {
        PooledThread t;
        synchronized (pool) {
            pool.removeIf(
                    (time) -> {
                        long now = System.currentTimeMillis();
                        return now - time.LastUsed> TimeoutTime;
                    });
            if (pool.isEmpty()) {
                t = new PooledThread(r);
                t.start();
            } else {
                t = pool.remove(0);
                t.setRunnable(r);
                t.notify();
            }
        }
        return t;
    }

    public static void main(String[] args) {

    }
}
