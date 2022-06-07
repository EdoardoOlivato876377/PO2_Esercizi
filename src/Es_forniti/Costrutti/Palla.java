package Costrutti;

public class Palla {
    private String color;

    Palla(){
        this.setColor("Rosso");
    }

    Palla(String c){
        this.setColor(c);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }
}
