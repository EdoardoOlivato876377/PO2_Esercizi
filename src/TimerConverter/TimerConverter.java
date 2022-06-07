package TimerConverter;

public class TimerConverter {
    public static final int GiornoSecondi=86400;
    public static final int OreSecondi=3600;
    public static final int MinutiSecondi=60;

    private int s,m,h,d;
    public int Convertitore(int sec,int min,int ore,int giorni){
        d=giorni*GiornoSecondi;
        h=ore*OreSecondi;
        m=min*MinutiSecondi;
        s=sec;
        return d+h+m+s;
    }


    public TimerConverter(int ss,int mm,int hh,int dd){
        Convertitore(ss,mm,hh,dd);
    }
}
