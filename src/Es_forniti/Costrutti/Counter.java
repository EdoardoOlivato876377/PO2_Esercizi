package Costrutti;

public class Counter {
    public static int COUNT = 0;        //Static: condivisa la variabile con tutte le istanze di Counter
    Counter() {
        COUNT++;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);  //Output = 2;
    }
}
