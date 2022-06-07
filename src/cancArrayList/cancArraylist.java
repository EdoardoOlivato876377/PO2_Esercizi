package cancArrayList;
import java.util.ArrayList;

public class cancArraylist {
    ArrayList<Integer> lista=new ArrayList<Integer>();

    public void cancellaInt(ArrayList<Integer> l){
        for(int i=0;i<l.size();i++){
            if(l.get(i)%2==0)
                l.remove(i);
        }
    }

    public void print(ArrayList<Integer> l){
        for(int j=0;j<l.size();j++){
            System.out.println("Elementi:"+" "+ l.get(j));
        }
    }

    public cancArraylist(ArrayList<Integer> list1) {
        cancellaInt(list1);
    }

}
