package SimulazioneEsame_3.es2;

public class SemaforoVeicoli implements Semaforo {
    private String status;

    @Override
    public String getMessaggio() {
        if(getMessaggio().equals("Verde")){
            return MessaggioSemaforo.parti.toString();
        }else if(getMessaggio().equals("Rosso")){
            return MessaggioSemaforo.fermo.toString();
        }else
            return MessaggioSemaforo.frena.toString();
    }

    @Override
    public String moveTogo(String colorenuovo) {
        if(colorenuovo.equals("Rosso")){
            status="Giallo";
        }else if(colorenuovo.equals("Giallo")){
            status="Verde";
        }
        return status;
    }

    @Override
    public String moveTostop(String colorenuovo) {
        if(colorenuovo.equals("Verde")){
            status="Giallo";
        }else if(colorenuovo.equals("Giallo")){
            status="Rosso";
        }
        return status;
    }
}
