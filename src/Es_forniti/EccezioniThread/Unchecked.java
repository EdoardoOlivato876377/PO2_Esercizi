package EccezioniThread;

public class Unchecked {
    public static void main (String[] args){
        int value = 7;
        value = value / 0;
    }
/*
Exception in thread “main”
java.lang.ArithmeticException: /by zero
	at MyClass.main(MyClass.java:4)
*/

}
