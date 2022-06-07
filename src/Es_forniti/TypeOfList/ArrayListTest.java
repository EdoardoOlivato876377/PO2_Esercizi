package TypeOfList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main (String[] args){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("RED");
        colors.add("BLUE");
        colors.add("GREEN");
        colors.add("ORANGE");
        colors.remove("GREEN");

        System.out.println(colors);
    }
}
