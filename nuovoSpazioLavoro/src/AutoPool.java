import java.util.Queue;

public class AutoPool implements Pool{
    Queue <Object> coda;
    Object elementRimuovi=coda.element();
    @Override
    public void add(Object x) {
        coda.add(x);
    }

    @Override
    public Object acquire() throws InterruptedException {
        return coda.remove(coda.element());
    }

    @Override
    public void release(Object x) {
        coda.add(elementRimuovi);
    }
    public void release(){
        coda.remove(coda.element());
    }
}

