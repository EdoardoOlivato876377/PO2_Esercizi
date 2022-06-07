package Esercizi_Prova.Domande;

public class Humanoid implements Comparable<Humanoid> {
    protected int strength;
    public Humanoid(int strength) { this.strength = strength; }
    @Override
    public int compareTo(Humanoid o) { return -(strength - o.strength); }
}
