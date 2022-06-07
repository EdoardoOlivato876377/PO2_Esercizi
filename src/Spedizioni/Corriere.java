package Spedizioni;
import java.util.ArrayList;

public class Corriere {
    private ArrayList<Destinazioni> destinazione;
    private ArrayList<Pacco> pacchi;

    public Corriere(){
        destinazione=new ArrayList<Destinazioni>();
        pacchi=new ArrayList<Pacco>();
    }
    private int cercaDestinazione(String unaCittà){
        int result=-1;
        for(int i=0;i<destinazione.size();i++)
        if(destinazione.get(i).getCittà()==unaCittà){
            result=i;
        }
        return result;
    }
    private int cercaPacco(String unCodice){
        int result=-1;
        for(int i=0;i<pacchi.size();i++)
            if(pacchi.get(i).getCodice()==unCodice){
                result=i;
            }
        return result;
    }
    public void aggiungiUnaDestinazione(String unaCittà){
        if(cercaDestinazione(unaCittà)==-1){
            Destinazioni temp=new Destinazioni(unaCittà);
            destinazione.add(temp);
        }
    }
    public void aggiungiPacco (String unCodice, int unPeso,String unaDestinazione) {
        if(cercaPacco(unCodice)!= -1) return;
        if(cercaDestinazione(unaDestinazione)!=-1) {
            Pacco b = new Pacco(unCodice, unPeso, unaDestinazione);
            pacchi.add(b); }
        if(cercaDestinazione(unaDestinazione)==-1) {
            aggiungiUnaDestinazione(unaDestinazione);
            Pacco a = new Pacco (unCodice, unPeso, unaDestinazione);
            pacchi.add(a); }
    }
    public void rimuoviPacco(String unCodice){
        if(cercaPacco(unCodice)!=-1){
            pacchi.remove(cercaPacco(unCodice));
        }
    }
    public void scambiaDestinazione(String primoCodice, String secondoCodice){
        String suppPrimo=null;
        String suppSecondo=null;
        int i=0;
        int j=0;
        if(cercaPacco(primoCodice)!=-1 && cercaPacco(secondoCodice)!=-1){
            for(i=0;i<pacchi.size();i++){
                if(cercaPacco(primoCodice)!=-1){
                        suppPrimo=pacchi.get(i).getDestinazione();
                    }
                }
            for(j=0;j<pacchi.size();j++) {
                if (cercaPacco(primoCodice) != -1) {
                    suppSecondo = pacchi.get(j).getDestinazione();
                }
            }
            pacchi.get(j).setDestinazione(suppPrimo);
            pacchi.get(i).setDestinazione(suppSecondo);
        }
    }
    public int pesoDestinazione(String unaCittà){
        int somma=0;
        for(int i=0;i<pacchi.size();i++){
            if(pacchi.get(i).getDestinazione()==unaCittà){
                somma=pacchi.get(i).getPeso()+somma;
            }
        }
        return somma;
    }
    public void spedisciDestinazione(String unaCittà){
        if(cercaDestinazione(unaCittà)!=-1){
            for(int i=0;i<pacchi.size();i++) {
                if (pacchi.get(i).getDestinazione() == unaCittà) {
                    pacchi.remove(i);
                }
            }
        }
    }
    public double pesoMedio(){
        double peso=0;
        double somma=0;
        int i;
        for(i=0;i<pacchi.size();i++){
            somma=pesoDestinazione(destinazione.get(i).getCittà())+somma;
        }
            peso=somma/i;
        return peso;
    }
}
