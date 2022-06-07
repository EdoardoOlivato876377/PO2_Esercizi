package ClassiAvanzata;

public class InnerClass {
    class Robot {
        int id;
        Robot(int i) {
            id = i;
            Brain b = new Brain();
            b.think();
        }

        private class Brain {
            public void think() {
                System.out.println(id + " is thinking");
            }
        }
    }
/*  Da mettere static "Robot" o non funziona
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }*/
}
