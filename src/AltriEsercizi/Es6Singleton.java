package AltriEsercizi;

import org.jetbrains.annotations.Nullable;

public class Es6Singleton {

    public static class Singleton{

        @Nullable
        public static Singleton instance = null;

        private int field;

        private Singleton(int field) {
            this.field = field;
        }


        public int getField() {
            return field;
        }



        public static Singleton getInstance(int x){
            if (instance == null || instance.field != x){
                instance = new Singleton(x);
            }
            return instance;
        }

    }

    public static void main(String[] args) {
        try {
            Singleton a1 = Singleton.getInstance(5);
            Singleton a2 = Singleton.getInstance(7);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
