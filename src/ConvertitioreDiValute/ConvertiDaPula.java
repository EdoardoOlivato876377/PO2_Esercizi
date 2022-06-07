package ConvertitioreDiValute;

public class ConvertiDaPula implements Convertitore {
    @Override
    public double convertiValore(double x) {
        double y=x*13.16;
        return y;
    }
}
