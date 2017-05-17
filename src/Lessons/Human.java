package Lessons;

/**
 * Created by daniel on 5/17/17.
 */
public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human() {

    }

    public void speak(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }

    public void eat(){
        System.out.println("Daniel is Eating...");
    }

    public void walk(){
        System.out.println("Daniel is Walking...");
    }

    public void working(){
        System.out.println("Daniel is Working...");
    }

    public void headingHome(){
        System.out.println("Daniel is heading home...");
    }

    public void sleeping(){
        System.out.println("Daniel is sleeping...");
    }

}
