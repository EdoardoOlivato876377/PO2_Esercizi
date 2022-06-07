package cancArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class cancTest {
    public static void  main(String[] argv) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire?");
        String e = inserisci.nextLine();
        int elem=Integer.parseInt(e);
        for(int i=0;i<elem;i++){
            System.out.println("Inserisci numero intero:");
            String k1 = inserisci.nextLine();
            int k=Integer.parseInt(k1);
            list.add(k);
        }
        cancArraylist lista=new cancArraylist(list);
        lista.cancellaInt(list);
        lista.print(list);
    }
}
