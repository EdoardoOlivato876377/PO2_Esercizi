package CarFuel;
public class benzinaio {
    private final double DieselPrice=0.90;
    private final double BenzinaPrice=0.70;
    public double getDiesel(){
       return DieselPrice;
    }
    public double getBenzina(){
        return BenzinaPrice;
    }
    public double CostoCarburante(int a, Double litri){
        if(a==1){//diesel
            return getDiesel()*litri;
        }else if(a==0){//benzina
            return getBenzina()*litri;
        }else throw new IllegalArgumentException("Carburante inserito" + a);
    }
}
