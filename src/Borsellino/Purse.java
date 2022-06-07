package Borsellino;
import java.util.ArrayList;

public class Purse {
    ArrayList <String> a=new ArrayList<>();
    public void addCoin(String coinName){
        a.add(coinName);
    }
    public void tostring(){
        System.out.print("Purse[");
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+",");
        }
        System.out.print("]");
    }

}
