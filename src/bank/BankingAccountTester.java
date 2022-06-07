package bank;

import java.util.Scanner;
public class BankingAccountTester extends BankingAccount{
    public static void main(String[] arg){
        BankingAccount account=new BankingAccount();
        Scanner prel = new Scanner(System.in);
        account.setter(100);
        System.out.println("Inserisci la tua password:");
        String r = prel.nextLine();
        int r11 = Integer.parseInt(r);
        Password Verificatore=new Password(r11);
        Scanner prel1 = new Scanner(System.in);
        boolean password= Verificatore.Pass(r11);
        if (password == true) {
            System.out.println("Scrivi Cosa vuoi fare: prelevare:1 o versare:0");
            String r2 = prel.nextLine();
            int r1 = Integer.parseInt(r2);
            if (r1 == 1) {
                System.out.println("Inserisci importo:");
                String i = prel.nextLine();
                int prelievo = Integer.parseInt(i);
                BankingAccount.prelleva(prelievo);
                System.out.println(account.StampaSaldo());
            } else if (r1 == 0) {
                System.out.println("Inserisci importo:");
                String j = prel.nextLine();
                int versamento = Integer.parseInt(j);
                BankingAccount.versamento(versamento);
                System.out.println(account.StampaSaldo());

            } else {
                System.out.println("Nel tuo conto hai ora:" + account.StampaSaldo());
            }
        }
        System.out.println("Operazione conclusa");
    }
}
