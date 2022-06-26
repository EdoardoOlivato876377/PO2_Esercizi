import java.util.Iterator;

public class Pair <A,B> {
    public final A fst;
    public final B snd;

    public Pair(A x, B y){
        this.fst=x;
        this.snd=y;
    }
    public static <A> Iterator <Pair<A,A>> pairIterator(Iterator <A> iter){
        return new Iterator <>(){
            A last;
            @Override
            public boolean hasNext(){
                if(iter.hasNext()){
                    last=iter.next();
                }
                return iter.hasNext();
            }
            @Override
            public Pair<A,A> next(){
               return new Pair<>(last,iter.next());
            }
        };
    }
}
