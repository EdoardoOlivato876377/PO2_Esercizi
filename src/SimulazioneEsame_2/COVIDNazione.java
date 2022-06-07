package SimulazioneEsame_2;

public class COVIDNazione extends COVIDAreaGeografica {
    public String nazione;
    public int abitanti=0;

    COVIDNazione(String a,int b){
        nazione=a;
        abitanti=b;
    }
    @Override
    protected boolean aggiungiInfettati(int a){
        int infettati= getInfettati();
        infettati=infettati+a;
        if(infettati<abitanti){
            return true;
        }else{
            infettati=infettati-a;
            return false;
        }
    }
    @Override
    protected boolean aggiungiguariti(int a){
        int guariti= getGuariti();
        guariti=guariti+a;
        if(guariti<guariti){
            return true;
        }else{
            guariti=guariti-a;
            return false;
        }
    }
    @Override
    protected boolean aggiungiDeceduti(int a){
        int deceduti= getDeceduti();
        deceduti=deceduti+a;
        if(deceduti<this.abitanti){
            return true;
        }else{
            deceduti=deceduti-a;
            return false;
        }
    }
    protected double getPercentualeInfettatiCorrenti(){
        double percentuale=0;
        percentuale=getInfettatiCorrenti()/100;
        return percentuale;
    }


    
}
