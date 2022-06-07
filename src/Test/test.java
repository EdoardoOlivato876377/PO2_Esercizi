package Test;



public class test {
    public static void main(String [] argv) throws Exception {
        Persone p1=new Persone("Edoardo", 17);

        pompi p12=new pompi();

        boolean ris= (p12 instanceof POmpiere);
        System.out.println(ris);


    }
}
