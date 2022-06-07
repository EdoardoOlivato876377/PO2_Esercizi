package Thread;

public class crea_programma extends Thread{
    @Override
    public void run() {
        System.out.println("Ciao come stai?");
        super.run();
    }
    public static void main(String [] arg){
        crea_programma prog=new crea_programma();
        prog.start();
    }
}
