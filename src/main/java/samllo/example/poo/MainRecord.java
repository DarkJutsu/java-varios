package samllo.example.poo;

import utils.Person;

public class MainRecord {
    public static void main(String[] args) {
        Person p1 = new Person("Jose Ulloa", "SA Pol38");
//        Person pUnknown = new Person(null, null);
        Person pName = new Person("Bryan");
        String pUnnamed = Person.unnamed("La Union").toString();

        System.out.println(p1.toString());
//        System.out.println(pUnknown.toString());
        System.out.println(pName.toString());
        System.out.println(pUnnamed);
    }
}
