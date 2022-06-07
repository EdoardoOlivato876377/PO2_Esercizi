package Spedizioni;
import java.util.ArrayList;
public class TestSpedizioni {
    public static void main(String[] args) {
        Corriere truck = new Corriere();
        truck.aggiungiUnaDestinazione("Padova");
        truck.aggiungiUnaDestinazione("Vicenza");
        truck.aggiungiUnaDestinazione("Milano");
        truck.aggiungiUnaDestinazione("Vicenza");
        truck.aggiungiPacco("0001", 10, "Padova");
        truck.aggiungiPacco("0002", 12, "Vicenza");
        truck.aggiungiPacco("0003", 18, "Vicenza");
        truck.aggiungiPacco("0004", 67, "Milano");
        System.out.println(truck.pesoDestinazione("Vicenza"));
        truck.scambiaDestinazione("0001", "0003");
        System.out.println(truck.pesoDestinazione("Vicenza"));
        truck.spedisciDestinazione("Padova");
        truck.rimuoviPacco("0002");
        System.out.println(truck.pesoMedio());
    }
}