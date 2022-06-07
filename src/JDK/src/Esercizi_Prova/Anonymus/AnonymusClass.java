package Esercizi_Prova.Anonymus;

public class AnonymusClass {
    public void createClass() {
        Print p = new Print() {
            public void stampa() {
                System.out.println("Ciao questa è una anonymous class");
            }
        };
        p.stampa();
    }
}