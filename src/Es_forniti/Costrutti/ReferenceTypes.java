package Costrutti;

public class ReferenceTypes {
    public static void main (String[] args){
        Person j;
        j  = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }
    static void celebrateBirthday(Person p){
        p.setAge(p.getAge()+1);
    }
}
