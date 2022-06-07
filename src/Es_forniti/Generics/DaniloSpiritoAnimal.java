package Generics;

public class DaniloSpiritoAnimal {

    public static class Creature{
        protected int peso;
    }

    public static class Animal extends Creature{


        public Animal(int a) {
            this.peso = a;
        }


        private void eat(Animal a) {
            this.peso += a.peso;
        }
    }

    public static class Cane extends Animal {
        protected String colore;

        public Cane(int a, String b) {
            super(10);              // è uno stub. Piccola nota: Il super va prima (prima super classe, poi specializzata)
            this.colore = b;
        }

        //@Override                                       //Contro varianza
        public void eat(Cane a) {
            if (a.colore.equals("Rosso")) {
                this.peso += a.peso / 2;
            }
            else
                this.peso =+ a.peso;
        }
    }

    public static void main(String[] args) {
        Animal Animal = new Animal(5);
        Animal Fido1 = new Cane(5, "Rosso");
        Cane Fido2 = new Cane (10, "Nero");

        Fido1.eat(Fido2);                                  // Danilo qua rifiuta la realtà delle cose, ma ce l'ha fatta
    }
}