package ClassiAvanzata;

//Sono una maniera per estendere le classi esistenti al volo
public class AnonymousClass {
    static class Machine {
        public void start(){
            System.out.println("starting...");
        }
    }

    public static void main (String[] args){
        Machine m = new Machine(){
            @Override
            public void start(){
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
    /*
    Traducendo in lambda:
    Machine m = start() -> { System.out.println("Wooooo");};
     */
}
