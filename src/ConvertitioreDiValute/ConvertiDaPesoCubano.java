package ConvertitioreDiValute;

public class ConvertiDaPesoCubano implements Convertitore {
    @Override
    public double convertiValore(double x) {
        double y=x*31.26;
        return y;
    }
}
