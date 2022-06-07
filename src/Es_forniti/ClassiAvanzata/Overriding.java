package ClassiAvanzata;

public class Overriding {
    class Animal {
        public void makeSound() {
            System.out.println("Grr...");
        }
    }
    class Cat extends Animal {
        @Override                           //Polimorfismo a runtime
        public void makeSound() {
            System.out.println("Meow");
        }
    }
}
