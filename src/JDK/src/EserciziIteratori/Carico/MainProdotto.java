package EserciziIteratori.Carico;

import java.util.ArrayList;

public class MainProdotto {
    public static void main(String [] argv){
        ArrayList<Deperibili> x=new ArrayList<Deperibili>();
        Deperibili D1=new Deperibili(-7,"Pomodorini",20,1.0);
        Deperibili D2=new Deperibili(-7,"Ananas", 20, 2.0);
        Deperibili D3=new Deperibili(-7,"Insalata",20, 4.0);
        Deperibili D4=new Deperibili(-7, "Mango", 6, 2.0);
        x.add(D1);
        x.add(D2);
        x.add(D3);
        x.add(D4);
        Camion GH117GF=new Camion(x);
        GH117GF.print(x);
    }
}
