package EserciziIteratori.Carico;

import java.util.ArrayList;

import java.util.Iterator;

public class Camion {
    public Camion(ArrayList <Deperibili> carico){
       print(carico);
    }

    public void print(ArrayList <Deperibili> carico){
        Iterator<Deperibili> it= carico.iterator();
        for (Prodotto item:
             carico) {
            System.out.println("----------------------");
            System.out.println(it.next().getNomeprodotto());
            System.out.println(it.next().getquantità());
            System.out.println(it.next().qetprezzo());
            System.out.println("----------------------");
        }
    }
}
