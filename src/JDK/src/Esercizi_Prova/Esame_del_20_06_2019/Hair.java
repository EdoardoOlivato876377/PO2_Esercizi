package Esercizi_Prova.Esame_del_20_06_2019;

import java.util.Set;

public class Hair implements Equatable<Hair> {
    public final int length;
    public final Set<Color> colors;
    public Hair(int length, Set<Color> colors) {
        this.colors = colors;
        this.length = length;
    }
    @Override
    public boolean equals(Object other) {
        if(other==this){
            return true;
        }else if(other==null){
            return false;
        }else if(other.getClass()!=this.getClass()){
            return false;
        }else{
            return equalsTo((Hair) other);
        }
    }
    @Override
    public boolean equalsTo(Hair other) {
        if(other.colors==this.colors && other.length==this.length){
            return true;
        }else {
            return false;
        }
    }
}
