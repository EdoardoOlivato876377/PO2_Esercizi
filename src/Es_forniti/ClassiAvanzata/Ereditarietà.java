package ClassiAvanzata;

public class Ereditarietà {
    static class Animal {
        protected int legs;
        public void eat(){
            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {
        Dog(){
            legs = 4;
        }
    }

    public static void main (String[] args){
        Dog d = new Dog();
        d.eat();
    }
}
