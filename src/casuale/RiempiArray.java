package casuale;
import java.util.*;

public class RiempiArray {

    public static int[] ArrayP(){
        System.out.print("Quanti elementi ha l'array? (un intero > 0) ");
        Scanner Input=new Scanner(System.in);
        int n = Input.nextInt();
        int[] numeri=new int[n];
        for (int i = 0; i < n; i++) {
            Scanner input = new Scanner(System.in);
            numeri[i]=input.nextInt();
        }
        return numeri;
    }
}
