package SingletonAndSorting;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Singleton {

    @Nullable
    private static Singleton instance = null;

    private int field;

    private Singleton(int x) {
        this.field = x;
    }

    public int getField() { return field; }

    @NotNull
    public static Singleton getInstance(int x) {
        if (instance == null || instance.field != x) {
            instance = new Singleton(x);
        }
        return instance;
    }
}
