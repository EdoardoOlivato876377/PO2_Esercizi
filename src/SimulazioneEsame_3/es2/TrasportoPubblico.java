package SimulazioneEsame_3.es2;

public class TrasportoPubblico implements Semaforo{
    public String status;
    @Override
    public String getMessaggio() {
        if(getMessaggio().equals("-")){
            return MessaggioSemaforo.parti.toString();
        }else if(getMessaggio().equals("|")){
            return MessaggioSemaforo.fermo.toString();
        }else
            return MessaggioSemaforo.frena.toString();
    }

    @Override
    public String moveTogo(String c) {
        if(c.equals("-")){
            status="/\\";
        }else if(c.equals("/\\")){
            status="-";
        }
        return status;
    }

    @Override
    public String moveTostop(String c) {
        if(c.equals("-")){
            status="/\\";
        }else if(c.equals("/\\")){
            status="|";
        }
        return status;
    }
}
