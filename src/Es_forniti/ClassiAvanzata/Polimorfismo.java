package ClassiAvanzata;

public class Polimorfismo {
    static class Animal {
        public void makeSound() {
            System.out.println("Grr...");
        }
    }
    static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meow");
        }
    }
    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static void main(String[ ] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
    }
}
