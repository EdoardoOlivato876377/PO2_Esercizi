package SimulazioneEsame_3.es2;

public class StatoSemaforo {
    private final String stato;
    public static final StatoSemaforo verticale = new StatoSemaforo("|");
    public static final StatoSemaforo triangolo = new StatoSemaforo("/\\");
    public static final StatoSemaforo orizzontale = new StatoSemaforo("-");
    private StatoSemaforo(String stato) {
        this.stato=stato; }
}
