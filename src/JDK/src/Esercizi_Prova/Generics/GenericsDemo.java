package Esercizi_Prova.Generics;
import java.util.ArrayList;

import java.util.Collection;

public class GenericsDemo {

    public static void validateTillStringType(Collection<? extends String> collection){
        //Jolly con limite inferiore
        // Accetta la raccolta di oggetti di tipo string o SUPER-CLASS di String
    }

    public static void validateStringTypes(Collection<? super String> collection){
        //Jolly con limite superiore
        // Accetta la raccolta di oggetti di tipo string o SUB-CLASS di String
    }
/*
    public static void main(String [] args){
        GenericsDemo g=new GenericsDemo();
        g.validateTillStringType(new ArrayList<Object>());//OK

        g.validateTillStringType(new ArrayList<Integer>());//Errore

        g.validateStringTypes(new ArrayList<Object>());//Errore

        g.validateStringTypes(new ArrayList<String>()); //ok

*/

}