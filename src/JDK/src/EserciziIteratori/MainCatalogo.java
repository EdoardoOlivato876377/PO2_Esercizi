package EserciziIteratori;

public class MainCatalogo {
    public static void main(String[] args){
        Articol Art1=new Articol();
        Art1.nomeArticolo="Pere";
        Art1.prezzoArticolo=3.00;
        Catalogo c1=new Catalogo();
        c1.aggiungiArticolo(Art1);
        c1.print(c1.prodottiSottoPrezzo(10.10));
    }
}
