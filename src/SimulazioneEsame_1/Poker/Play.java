package SimulazioneEsame_1.Poker;
import java.util.ArrayList;

/* TODO:
Progettate e implementate tutte le classi che ritenete necessarie per realizzare un simulatore del popolare gioco
d’azzardo solitamente chiamato “video poker”. Il mazzo di carte ne contiene 52, 13 per ciascun seme, e viene mescolato
all’inizio del gioco: dovete individuare una modalita’ di mescolamento che sia equa, anche se non e’ necessario che sia
efficiente. Successivamente vengono mostrate le prime cinque carte del mazzo al giocatore, che ne puo’ rifiutare alcune,
anche tutte, o nessuna. Le carte rifiutate vengono sostituite con altre, prelevate ordinatamente dal mazzo. A questo punto,
sulla base delle cinque carte che il giocatore ha in mano, il programma comunica il punteggio ottenuto, che deve essere
il maggiore tra i seguenti, elencati in ordine crescente:
        • No pair (“Niente”). La configurazione peggiore, che contiene cinque carte spaiate che non compongono alcuna
        delle configurazioni elencate nel seguito.
        • One pair (“Coppia”). Due carte dello stesso valore, ad esempio due regine.
        • Two pairs (“Doppia coppia”). Due coppie, ad esempio due regine e due cinque.
        • Three of a kind (“Tris”). Tre carte dello stesso valore, ad esempio tre regine.
        • Full House (“Full”). Un tris e una coppia, ad esempio tre regine e due 5.
        • Four of a kind (“Poker”). Quattro carte con lo stesso valore, ad esempio quattro regine.
        medesimo seme.
        Non `e necessario implementare alcuna interfaccia utente o permettere effettivamente di giocare. Semplicemente
        scrivere un main che svolga le seguenti operazioni tramite gli opportuni metodi:
        • Mescola il mazzo;
        • Preleva una mano per il giocatore;
        • Se non ha almeno un full cambia 3 carte (se ha coppia), 2 carte (se ha tris) o una carta (se ha
        doppia coppia);
        • Preleva una mano per il computer e stampa chi ha vinto.
 */
public class Play {
    ArrayList <String> Seme1=new ArrayList<String>(13);
    ArrayList <String> Seme2=new ArrayList<String>(13);
    ArrayList <String> Seme3=new ArrayList<String>(13);
    ArrayList <String> Seme4=new ArrayList<String>(13);
    ArrayList <String> MazzoReal=new ArrayList<String>(52);
    public void mescolaMazzo(){
        //Seme picche
        Seme1.add("A");
        Seme1.add("R");
        Seme1.add("D");
        Seme1.add("J");
        Seme1.add("10");
        Seme1.add("9");
        Seme1.add("8");
        Seme1.add("7");
        Seme1.add("6");
        Seme1.add("5");
        Seme1.add("4");
        Seme1.add("3");
        Seme1.add("2");
        //Seme cuori
        Seme2.add("A");
        Seme2.add("R");
        Seme2.add("D");
        Seme2.add("J");
        Seme2.add("10");
        Seme2.add("9");
        Seme2.add("8");
        Seme2.add("7");
        Seme2.add("6");
        Seme2.add("5");
        Seme2.add("4");
        Seme2.add("3");
        Seme2.add("2");
        //Seme quadri
        Seme3.add("A");
        Seme3.add("R");
        Seme3.add("D");
        Seme3.add("J");
        Seme3.add("10");
        Seme3.add("9");
        Seme3.add("8");
        Seme3.add("7");
        Seme3.add("6");
        Seme3.add("5");
        Seme3.add("4");
        Seme3.add("3");
        Seme3.add("2");
        //Seme fiori
        Seme4.add("A");
        Seme4.add("R");
        Seme4.add("D");
        Seme4.add("J");
        Seme4.add("10");
        Seme4.add("9");
        Seme4.add("8");
        Seme4.add("7");
        Seme4.add("6");
        Seme4.add("5");
        Seme4.add("4");
        Seme4.add("3");
        Seme4.add("2");
        for(int i=0;i<Seme1.size();i++){
            if(i%2==0){
                MazzoReal.add(Seme3.get(i));
                MazzoReal.add(Seme4.get(i));
                MazzoReal.add(Seme1.get(i));
                MazzoReal.add(Seme2.get(i));
            }else{
                MazzoReal.add(Seme2.get(i));
                MazzoReal.add(Seme4.get(i));
                MazzoReal.add(Seme3.get(i));
                MazzoReal.add(Seme1.get(i));
            }
        }
    }
    public ArrayList <String> prellevaMano(ArrayList <String> a){
        ArrayList <String> mazzoPassato=new ArrayList<String>();
        for(int i=0;i<a.size() && i<5;i++){
            mazzoPassato.add(a.get(i));
            a.remove(i);
        }
        for(int k=0;k<mazzoPassato.size();k++){
            mazzoPassato.get(k);
        }
        return mazzoPassato;
    }
    public int countprima(ArrayList <String> b){
        int conta=0;
        for (int j = 1; j < b.size(); j++) {
            if (b.get(0) == b.get(j)) {
                conta++;
            }
        }
        return conta;
    }
    public int countsecond(ArrayList <String> b){
        int conta=0;
        for (int j = 0; j < b.size(); j++) {
            if (b.get(0) == b.get(j)) {
                conta++;
            }
        }
        return conta-1;
    }
    public int countterza(ArrayList <String> b){
        int conta=0;
        for (int j = 1; j < b.size(); j++) {
            if (b.get(2) == b.get(j)) {
                conta++;
            }
        }
        return conta-1;
    }
    public int countquart(ArrayList <String> b){
        int conta=0;
        for (int j = 1; j < b.size(); j++) {
            if (b.get(3) == b.get(j)) {
                conta++;
            }
        }
        return conta-1;
    }
    public int countquint(ArrayList <String> b){
        int conta=0;
        for (int j = 1; j < b.size(); j++) {
            if (b.get(4) == b.get(j)) {
                conta++;
            }
        }
        return conta-1;
    }
    public int Trovato(ArrayList <String> b){
        if(countprima(b)==2 || countsecond(b)==2 || countterza(b)==2 || countquart(b)==2 || countquint(b)==2){
            return 111; //"One pair"
        }else if((countprima(b)==2 || countsecond(b)==2 || countterza(b)==2 || countquart(b)==2 || countquint(b)==2) &&
                (countprima(b)==2 || countsecond(b)==2 || countterza(b)==2 || countquart(b)==2 || countquint(b)==2)){
            return 222; //"Two pair"
        }else if(countprima(b)==3 || countsecond(b)==3 || countterza(b)==3 || countquart(b)==3 || countquint(b)==3){
            return 333; //"Tris"
        }if((countprima(b)==3 || countsecond(b)==3 || countterza(b)==3 || countquart(b)==3 || countquint(b)==3)&&
                (countprima(b)==2 || countsecond(b)==2 || countterza(b)==2 || countquart(b)==2 || countquint(b)==2)){
            return 555; //"Full";
        }if(countprima(b)==4 || countsecond(b)==4 || countterza(b)==4 || countquart(b)==4 || countquint(b)==4){
            return 444; //"Poker"
        }else
            return 000; //No result
    }
}
