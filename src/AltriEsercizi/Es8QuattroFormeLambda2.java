package AltriEsercizi;

public class Es8QuattroFormeLambda2 {
    @FunctionalInterface
    public interface Function<A, B>{
        B apply(A a);
    }

    public interface Consumer<A>{
        void accept(A a);
    }

    public interface  Supplier<A>{
        A get();
    }

    public interface Runnable{
        void run();
    }

    private static interface TriFunction <A, B, C, D> {
        public D apply(A a, B b, C c);
    }
}
