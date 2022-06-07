package Costrutti;

public class Veicolo {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    private String color2;

    Veicolo(){
        color2 = "Blue";
    }

    void horn(){
        System.out.println("Beep!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
