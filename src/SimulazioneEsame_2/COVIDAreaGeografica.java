package SimulazioneEsame_2;

public class COVIDAreaGeografica implements COVID_Statistiche{
    private int infettati=0;
    private int guariti=0;
    private int deceduti=0;
    @Override
    public int getInfettati() {
        return infettati;
    }

    @Override
    public int getGuariti() {
        return guariti;
    }

    @Override
    public int getDeceduti() {
        return deceduti;
    }

    @Override
    public int getInfettatiCorrenti() {
        return infettati-deceduti-guariti;
    }

    protected boolean aggiungiInfettati(int a){
        int indicePrecedenteInfettati=0;
        indicePrecedenteInfettati=getInfettati();
        infettati=infettati+a;
        if(infettati-indicePrecedenteInfettati==a)
            return true;
        else
            return false;
    }
    protected boolean aggiungiguariti(int a){
        int indicePrecedenteguariti=0;
        indicePrecedenteguariti=getGuariti();
        guariti=guariti+a;
        if(guariti-indicePrecedenteguariti==a)
            return true;
        else
            return false;
    }
    protected boolean aggiungiDeceduti(int a){
        int indicePrecedenteDeceduti=0;
        indicePrecedenteDeceduti=getGuariti();
        guariti=guariti+a;
        if(guariti-indicePrecedenteDeceduti==a)
            return true;
        else
            return false;
    }
    COVIDAreaGeografica(){
        infettati=0;
        guariti=0;
        deceduti=0;
    }
}
