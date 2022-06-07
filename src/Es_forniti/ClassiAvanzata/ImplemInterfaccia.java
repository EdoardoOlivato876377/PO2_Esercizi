package ClassiAvanzata;

public class ImplemInterfaccia {
    class Cat implements Interfaccia {              //anche se non statica
        public void makeSound(){
            System.out.println("Meow");
        }
        public void eat(){
            System.out.println("omnomnom");
        }
    }
}
