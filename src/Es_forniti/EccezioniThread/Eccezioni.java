package EccezioniThread;

public class Eccezioni {

    int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero");
        }
	    else {
                return a/b;
	    }
    }


        public static void main (String[] args){
        try{
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println ("An error occurred");
        }
    }
}
