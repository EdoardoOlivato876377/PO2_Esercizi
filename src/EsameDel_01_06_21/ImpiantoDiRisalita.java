package EsameDel_01_06_21;

import java.util.ArrayList;

public class ImpiantoDiRisalita {
    public ArrayList sciatori=new ArrayList();
    public int punti;
    public int dislivello;

    ImpiantoDiRisalita(int metri, int punti){
        this.sciatori.add("");
        this.punti=punti;
        this.dislivello=metri;
    }
    /*protected void trasporta(Sciatore sciatore) throws PuntiNonSufficientiException{
        if(sciatore.prendi_funivia()){
            sciatori.add(sciatore);
        }
    }
     */
    public int sciatori_trasportati(){
        for(int i=0;i<sciatori.size()-1;i++){
            for(int j=1;j<sciatori.size();j++) {
                if(sciatori.get(i)==sciatori.get(j)){
                    sciatori.remove(j);
                }
            }
        }
        return sciatori.size();
    }
}
