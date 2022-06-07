package Borsellino;

public class PurseTest {
    public static void main(String [] arg){
        Purse a=new Purse();
        a.addCoin("Quarter");
        a.addCoin("Dime");
        a.addCoin("Nickel");
        a.addCoin("dime");
        a.tostring();
    }
}
