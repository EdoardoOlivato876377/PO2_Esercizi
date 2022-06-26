public interface Pool<T, R> {
    void add(T x); // popola la pool con un nuovo elemento
    R acquire() throws InterruptedException; // acquisisce una risorsa
    void release(R x); // rilascia una risorsa e la rimette nella pool
}
