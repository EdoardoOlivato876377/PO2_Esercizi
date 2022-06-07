package casuale;
public class MainOrdina {
    public static void main (String [] arg) {
        int[] unArray = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
        System.out.println("valori dell'array prima dell'ordinamento");
        for (int i = 0; i < unArray.length; i++) {
            System.out.print(unArray[i] + " ");
        }
        System.out.println();
        Mergsort.ordina(unArray);
        System.out.println("Valori dell'array dopo l'ordinamento");
        for (int i = 0; i < unArray.length; i++) {
            System.out.print(unArray[i] + " ");
        }
        System.out.println();
    }
}
