package PO2;

public class Città <T>{
    private T city;
    public Città(T t){
        city=t;
    }
    public T getContenuto(){
        return city;
    }

}
