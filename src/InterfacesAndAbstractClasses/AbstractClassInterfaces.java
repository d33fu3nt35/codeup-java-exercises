package InterfacesAndAbstractClasses;

/**
 * Created by daniel on 5/19/17.
 */
public class AbstractClassInterfaces {
    public static void main(String[] args) {


        Developer daniel = new Developer("Fer", 5.0);
        System.out.println(daniel.work());
        System.out.println(daniel.getPay());

        Accountant stacy = new Accountant("Stacy", 1.0);
        System.out.println(stacy.work());
        System.out.println(stacy.getPay());


    }
}
