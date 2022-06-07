package ConvertitioreDiValute;

public class ConvertiDaRupiaIndiana implements Convertitore {
    @Override
    public double convertiValore(double x) {
        double y=x*87.55;
        return y;
    }
}
