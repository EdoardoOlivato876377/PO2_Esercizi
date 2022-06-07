package Pila;
import java.util.ArrayList;

public class Pila {
    private void inserisci(ArrayList <Integer> a,int b){
        a.add(b);
    }
    public void setter(ArrayList <Integer> a,int b){
        inserisci(a,b);
    }
    private void remove(ArrayList <Integer> a,int b){
        int i=0;
        boolean trovato=false;
        while(i<a.size()&&trovato==false){
            if(a.get(i)==b){
                a.remove(i);
                trovato=true;
            }else{
                a.remove(i);
                trovato=false;
            }
        }
        System.out.println("Elemento"+ b +" trovato e rimosso");
    }
    public void getter(ArrayList <Integer> a,int b){
        remove(a,b);
    }
    Pila(ArrayList <Integer> a, int b){
        setter(a,b);
        getter(a,b);
    }
    public static void main(String [] argv){
        ArrayList <Integer> a=new ArrayList<Integer>();
        int b=6;
        Pila p1=new Pila(a, b);
            p1.setter(a,b);
            p1.getter(a,b);
    }
}
