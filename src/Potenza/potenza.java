package Potenza;


public class potenza {
    public int potenziatore(int e,int b) {
        int a=b;
        while(e>1){
            a=a*(b);
            e--;
        }
        return a;
    }
    public static void main(String[] args){
        potenza p1=new potenza();
        int esponente=5;
        int base=2;
        int z=p1.potenziatore(5,2);
        System.out.println(z);
    }
}
