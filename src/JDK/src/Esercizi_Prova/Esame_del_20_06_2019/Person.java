package Esercizi_Prova.Esame_del_20_06_2019;

public class Person<P extends Person<P>> implements Equatable<P> {
    public final String name;
    public final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if(this==o){
            return true;
        }else if(o==null){
            return false;
        }else if(o.getClass()!=this.getClass()){
            return false;
        }
        return equalsTo((P) o);
    }
    @Override
    public boolean equalsTo(P other) {
        if(other.age==this.age && other.name==this.name){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return name;
    }
}
