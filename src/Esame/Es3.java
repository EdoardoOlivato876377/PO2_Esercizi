package Esame;

// Piccola gerarchia di base delle collection partendo dai Set
// Generics first class, locale al metodo, polimorfismo parametrico first class, permettere il riuso del codice
// Generics che diventano type parameter, type parameter delle classi:


import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Es3 {
    public static class SortSer<T> implements Set{

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NotNull
        @Override
        public Object[] toArray(@NotNull Object[] a) {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean removeAll(@NotNull Collection c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection c) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection c) {
            return false;
        }
    }
}
