package Costrutti;

import Costrutti.Palla;

public class TestPalla {
    public static void main(String[] args){
        Palla p1 = new Palla();
        Palla p2 = new Palla("Green");

        System.out.println(p1.getColor());
        System.out.println(p2.getColor());
    }
}
