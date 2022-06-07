package Esercizi_Exception;

import java.util.ArrayList;

public class Prova {

    public boolean trova(int a,ArrayList<Integer> a1){
        int j=0;
        while(j<a1.size()) {
            if (a1.get(j)==a){
                return true;
            }else
                j++;
        }
        return false;
    }
    public void individua(int b,ArrayList<Integer> a1) throws Exception {
        if(trova(b,a1)==true)
            throw new Exception("Elemento non trovato");
        else
            System.out.println("Nice Work, we found the number");
    }
    Prova (int numero,ArrayList<Integer> a1) throws Exception {
        trova(numero,a1);
        individua(numero,a1);
    }
}