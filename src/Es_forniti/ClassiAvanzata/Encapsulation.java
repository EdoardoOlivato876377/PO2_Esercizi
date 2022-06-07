package ClassiAvanzata;

public class Encapsulation {
    class BankAccount{
        private double balance = 0;         //la variabile balance è nascosta e ci si può accedere solo con il metodo deposit
        public void deposit (double x){
            if ( x > 0 ){
                balance += x;
            }
        }
    }
}
