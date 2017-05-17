package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class Person {

    public static void main(String[] args) {
        Person Daniel = new Person();
        Daniel.setName("Daniel");
        Daniel.sayHello();
    }

    // RETURNS THE PERSONS NAME
    String name;

    public String getName() {
        return name;
    }

    // CHANGED THE NAME PROPERTY TO THE PASSED VALUE

    public void setName(String name) {
        this.name = name;
    }

    // PRINTS A MESSAGE TO THE CONSOLE USING THE PERSON'S NAME

    public void sayHello() {
        System.out.println(name);
    }

}
