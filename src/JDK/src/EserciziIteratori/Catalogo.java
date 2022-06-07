package EserciziIteratori;
import java.util.ArrayList;
import java.util.Iterator;

/*Esercizio 2 (esercizio 16.4 del libro di testo). Sia definita una interface Articolo che rappresenta articoli
commerciali, dotata dei metodi String getNome() che restituisce il nome dell'articolo, double getPrezzo()
che restituisce il prezzo dell'articolo e String toString() che restituisce una descrizione (nome e prezzo)
dell'articolo.
Si scriva una classe Catalogo<E extends Articolo> che rappresenta un catalogo di articoli commerciali. La
classe memorizza gli articoli in una lista ed è dotata dei metodi void aggiungiArticolo(E art) che aggiunge un
articolo al catalogo, List<E> getArticoliSottoPrezzo(double prezzo) che restituisce una lista degli articoli il cui
prezzo è minore del valore passato come parametro, e String toString() che stampa l'intero catalogo.
*/
public class Catalogo extends Articol {
    ArrayList<Articol> ListaArticoli=new ArrayList<Articol>();
    public void aggiungiArticolo(Articol art){
        ListaArticoli.add(art);
    }
    public ArrayList<Articol> prodottiSottoPrezzo(double limite){
        ArrayList<Articol> ListaProdottiSottoPrezzo=new ArrayList<Articol>();
        Iterator<Articol> ArtIter=ListaProdottiSottoPrezzo.iterator();
            while(ArtIter.hasNext()){
                if(ArtIter.next().prezzoArticolo<limite){
                    ListaProdottiSottoPrezzo.add(ArtIter.next());
                }
            }
            return ListaProdottiSottoPrezzo;
    }
    public void print(ArrayList<Articol> Lista){
        Iterator<Articol> stampa=Lista.iterator();
        while (stampa.hasNext()){
            System.out.println(stampa.next());
        }
    }

}
