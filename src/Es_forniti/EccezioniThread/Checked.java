package EccezioniThread;

public class Checked {
    //Esempio di una exeception checked
    class MyClass {
        public static void main (String[] args){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //some code
            }
        }
    }




}
