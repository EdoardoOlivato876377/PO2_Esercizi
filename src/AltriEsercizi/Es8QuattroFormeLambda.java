package AltriEsercizi;

public class Es8QuattroFormeLambda {
    @FunctionalInterface
    public interface Function123<A, B> {
        B apply(A x);
    }

    public interface Consumer<A> {
        void accept(A x);
    }

    public interface Supplier<A> {
        A get();
    }

    public interface Runnable {
        void run();
    }
}
