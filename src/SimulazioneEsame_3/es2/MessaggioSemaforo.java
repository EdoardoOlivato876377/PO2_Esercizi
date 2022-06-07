package SimulazioneEsame_3.es2;

public class MessaggioSemaforo{
    private final String messaggio;
    public static final MessaggioSemaforo fermo = new MessaggioSemaforo("fermo");
    public static final MessaggioSemaforo parti = new MessaggioSemaforo("parti");
    public static final MessaggioSemaforo frena = new MessaggioSemaforo("frena");
    public MessaggioSemaforo(String messaggio) {
        this.messaggio=messaggio;
    }
}
