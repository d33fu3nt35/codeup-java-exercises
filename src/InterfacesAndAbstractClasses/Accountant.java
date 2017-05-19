package InterfacesAndAbstractClasses;

/**
 * Created by daniel on 5/19/17.
 */
public class Accountant extends Employee {

    public Accountant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String work() {
        return "Do number stuff, do payments..";
    }
}
