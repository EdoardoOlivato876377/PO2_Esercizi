package SilulazioneEsame.esCasuali;

public class SemaforoVeicoli {
    private ColoreSemaforo status;

    SemaforoVeicoli(){
        status=ColoreSemaforo.rosso;
    }

    protected void moveToStop(){
        if(status==ColoreSemaforo.verde){
            status=ColoreSemaforo.giallo;
        }else if(status==ColoreSemaforo.giallo){
            status=ColoreSemaforo.rosso;
        }else
            status=ColoreSemaforo.rosso;
    }
    protected void moveToGo(){
        if(status==ColoreSemaforo.rosso){
            status=ColoreSemaforo.giallo;
        }else if(status==ColoreSemaforo.giallo){
            status=ColoreSemaforo.verde;
        }else
            status=ColoreSemaforo.verde;
    }
    public ColoreSemaforo getColore(){
        return status;
    }
}
