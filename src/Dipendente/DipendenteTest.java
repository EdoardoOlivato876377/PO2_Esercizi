package Dipendente;
import java.util.Scanner;
public class DipendenteTest {
    public static void main(String[] arg){
        Dipendente dipendente0 = new Dipendente("Mattia",1500 );
        Scanner letturadipendente = new Scanner(System.in);
        System.out.println("Aggiornamento stipendio di:"+" "+dipendente0.getName());
        String letdip= letturadipendente.nextLine();
        int a=Integer.parseInt(letdip);
        dipendente0.aumento(a);
        System.out.println("Nuovo stipendio:"+" "+dipendente0.getStipendio());
    }
}

