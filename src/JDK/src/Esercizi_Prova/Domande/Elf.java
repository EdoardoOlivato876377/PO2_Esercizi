package Esercizi_Prova.Domande;

public class Elf extends Humanoid {
    protected int mana;
    public Elf(int strength, int mana) { super(strength); this.mana = mana; }
    @Override
    public int compareTo(Humanoid o) {
        if (o instanceof Elf) {
            Elf e = (Elf) o;
            return -((mana + strength) - (e.mana + e.strength));
        }
        else return super.compareTo(o);
    }
}
