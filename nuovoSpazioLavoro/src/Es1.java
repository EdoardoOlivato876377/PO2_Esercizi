import java.util.Iterator;

public class Es1 <A,B> {
    @FunctionalInterface
    public interface Function<A,B>{
        B apply (A x);
    }
    public static <A,B> Iterator<B> mapIterator(Iterator <A> iter, Function <A,B> f){
        return new Iterator<>(){

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public B next() {
                return f.apply(iter.next());
            }
        };
    }

}