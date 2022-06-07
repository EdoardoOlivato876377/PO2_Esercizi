package Esercizi_Prova;

import java.util.ArrayList;

public class Prova{
    private int altezza, larghezza, risultato;
    private ArrayList <Integer> elenco=new ArrayList<Integer>();
    Prova(int x, int y){
        System.out.println("Creo tutto");
        altezza=x;
        larghezza=y;
    }

    public int getAltezza(){
        return altezza;
    }

    public int getLarghezza(){
        return  larghezza;
    }

    public int getRisultato(){
        return risultato;
    }

    public int perimetro(){
        return ((altezza+larghezza)*2);
    }

    public void riempi(int n){
        for(int i=0;i<elenco.size();i++){
            elenco.add(n+1);
            n++;
        }
    }
    //provo con l'iteratore
    public void print() {
        for (int i = 0; i < elenco.size(); i++) {
            System.out.println(elenco.get(i));
        }
    }
    public static void  main(String [] arg){

        Prova x=new Prova(10,20);
        x.riempi(10);
        x.print();
    }
}

