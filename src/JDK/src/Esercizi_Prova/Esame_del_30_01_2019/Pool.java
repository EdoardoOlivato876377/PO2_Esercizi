package Esercizi_Prova.Esame_del_30_01_2019;

public interface Pool<T, R> {
    void add(T x);
    R acquire() throws InterruptedException;
    void release(R x);
}
