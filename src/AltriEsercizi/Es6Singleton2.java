package AltriEsercizi;

public class Es6Singleton2 {

    public static class Singleton {

        public static Singleton instance = null;

        public int getField() {
            return field;
        }

        private int field;

        private Singleton(int field) {
            this.field = field;
        }

        public static Singleton getInstance(int x) {
            if (instance == null || instance.field != x) {
                instance = new Singleton(x);
            }
            return instance;

        }
    }

    public static void main(String[] args) {
        try{
            Singleton a1 = Singleton.getInstance(5);
            Singleton a2 = Singleton.getInstance(7);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a2==a1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
