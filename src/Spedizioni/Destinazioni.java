package Spedizioni;

public class Destinazioni {
    private String città;

    public void setCittà(String a){
        città=a;
    }
    public String getCittà(){
        return città;
    }
    public Destinazioni(String c){
        setCittà(c);
        getCittà();
    }
}
