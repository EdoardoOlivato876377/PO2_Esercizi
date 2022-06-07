package PO2;

import java.util.HashSet;
import java.util.Iterator;

public class ProvaSetMain {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashSet<String> capitalCities = new HashSet<String>();

        // Add keys and values (Country, City)
        capitalCities.add("London");
        capitalCities.add("Berlin");
        capitalCities.add("Oslo");
        capitalCities.add("Washington DC");

        Iterator<String> it= capitalCities.iterator();
        System.out.println(capitalCities);
    }
}
