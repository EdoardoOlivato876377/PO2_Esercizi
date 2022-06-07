package SimulazioneEsame_3.es1;

public class SemaforiVeicoli {
    private String status;
    public SemaforiVeicoli(){
        status="Rosso";
    }
    protected String moveToStop(String colorenuovo){
        if(colorenuovo.equals("Verde")){
            status="Giallo";
        }else if(colorenuovo.equals("Giallo")){
            status="Rosso";
        }
        return status;
    }
    protected String moveTogo(String colorenuovo){
        if(colorenuovo.equals("Rosso")){
            status="Giallo";
        }else if(colorenuovo.equals("Giallo")){
            status="Verde";
        }
        return status;
    }
    public String getStatus(){
        return status;
    }
}
