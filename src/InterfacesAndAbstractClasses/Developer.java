package InterfacesAndAbstractClasses;

/**
 * Created by daniel on 5/19/17.
 */
public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String work() {
        return "Code, code, code, bug, fix, code..";

    }

}
