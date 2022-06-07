package Caldaie;

import java.util.ArrayList;

public class DittaRiparazioni {
    private ArrayList<Riparazioni> riparazione;
    private int soglia;
    private Tecnico[] tecnici;
    private int numeroTecnici;
    ArrayList<Riparazioni> ripAttesa;

    public DittaRiparazioni(int maxTecnici){
        soglia=maxTecnici;
        tecnici=new Tecnico[soglia];
    }
    public boolean aggRiparazione(String unIndirizzo, int unaPriorita){
        Riparazioni r1=new Riparazioni(unaPriorita,unIndirizzo);
        riparazione.add(r1);
        return true;
    }
    public ArrayList<Riparazioni> riparazioniInAttesa(){
        ripAttesa=new ArrayList<Riparazioni>();
        for(int i=0;i<riparazione.size();i++){
            for(int j=0;j<soglia;j++){
                if(tecnici[i].riparazione!=riparazione.get(i)){
                    ripAttesa.add(riparazione.get(i));
                }
            }
        }
        return ripAttesa;
    }
    public Riparazioni prossimaRiparazione(){
        Riparazioni prox=null;
        for(int i=0;i<riparazione.size();i++){
            if(riparazione.get(i).getPriorità()>=prox.getPriorità()){
                prox=riparazione.get(i);
            }
        }
        return prox;
    }
    public void assegnaRiparazione(){
        for(int i=0;i<soglia-1;i++){
            if(tecnici[i].riparazione==null){
                tecnici[i].riparazione=ripAttesa.get(i);
            }
        }
    }
    public void terminaRiparazione(String unNome){
        for(int y=0;y<soglia-1;y++){
            if(tecnici[y].nome==unNome){
                tecnici[y].riparazione=null;
            }
        }
    }
    public void ferie(ArrayList<String> listaNomi){
        for(int i=0;i<listaNomi.size();i++){
            for(int y=0;y<soglia;y++){
                if(listaNomi.get(i)==tecnici[y].nome){
                    tecnici[y].nome=null;
                    tecnici[y].riparazione=null;
                }
            }
        }
    }
}
