package PO2;

import java.util.HashSet;
import java.util.Iterator;

public class ProvaSetGenericsMain{
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashSet<Città> capitalCities = new HashSet<Città>();
        Città<String> Capitale1= new Città<String>(new String("Londra"));
        System.out.println();

        // Add keys and values (Country, City)

        Iterator<Città> it= capitalCities.iterator();
        System.out.println(capitalCities.iterator().next());
    }
}