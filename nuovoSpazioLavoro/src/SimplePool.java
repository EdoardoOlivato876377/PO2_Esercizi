import java.util.Iterator;
import java.util.Queue;

public class SimplePool <T> implements BasicPool{
    Queue <Object> coda;
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
        coda.add(x);
    }
}
