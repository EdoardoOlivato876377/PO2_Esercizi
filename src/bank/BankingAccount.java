package bank;
public class BankingAccount {
    private static int saldo=0;
    public  void setter(int n){
        saldo=saldo+n;
    }
    public static int prelleva(int prelleva){
        saldo=saldo-prelleva;
        return saldo;
    }
    public static int versamento(int versa){
        saldo=saldo+versa;
        return saldo;
    }
    public  int StampaSaldo(){
       return saldo;
    }
}
