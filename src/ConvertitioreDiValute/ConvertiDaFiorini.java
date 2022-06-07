package ConvertitioreDiValute;

public class ConvertiDaFiorini implements Convertitore {
    @Override
    public double convertiValore(double x) {
        double y=x*2.12;
        return y;
    }
}
