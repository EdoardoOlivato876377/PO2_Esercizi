package SilulazioneEsame.esCasuali;

public class ColoreSemaforo {
    private final String colore;
    public static final ColoreSemaforo verde = new ColoreSemaforo("verde");
    public static final ColoreSemaforo giallo = new ColoreSemaforo("giallo");
    public static final ColoreSemaforo rosso = new ColoreSemaforo("rosso");
    private ColoreSemaforo(String colore) {
        this.colore=colore;
    }
}
