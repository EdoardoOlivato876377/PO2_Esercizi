package TypeOfList;

import java.util.LinkedList;

public class ForEachLinkedList {
    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("RED");
        c.add("BLUE");
        c.add("GREEN");
        c.add("ORANGE");
        c.remove("GREEN");

        for (String s : c) {
            System.out.println(s);
        }
    }
}
