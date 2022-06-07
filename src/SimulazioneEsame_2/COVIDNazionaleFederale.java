package SimulazioneEsame_2;

import java.util.ArrayList;

public class COVIDNazionaleFederale implements COVID_Statistiche{
    COVIDAreaGeografica area=new COVIDAreaGeografica();
    ArrayList<COVID_Statistiche> regioni;
    protected void addregioni(COVID_Statistiche nomeregione){
        regioni.add(nomeregione);
    }
    @Override
    public int getInfettati() {
        return area.getInfettati() ;
    }

    @Override
    public int getGuariti() {
        return area.getGuariti();
    }

    @Override
    public int getDeceduti() {
        return area.getDeceduti();
    }

    @Override
    public int getInfettatiCorrenti() {
        return area.getInfettatiCorrenti();
    }
    COVIDNazionaleFederale(){
        getInfettati();
        getGuariti();
        getDeceduti();
        getInfettatiCorrenti();
    }
}
