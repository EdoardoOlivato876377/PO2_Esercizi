package Costrutti;

public class TestVeicolo {
    public static void main (String[] args){
        Veicolo v1 = new Veicolo();
        Veicolo v2 = new Veicolo();
        v1.color = "red";
        v1.setColor("Red");
        //v1.setColor2("Giallo");
        System.out.println(v1.getColor());
        System.out.println(v1.getColor2());
        v2.horn();
    }
}
