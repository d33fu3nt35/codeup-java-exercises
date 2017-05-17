package Lessons;

/**
 * Created by daniel on 5/17/17.
 */
public class Earth {
    public static void main(String[] args) {

        Human daniel;

        daniel = new Human();
        daniel.age = 21;
        daniel.name = "Daniel";
        daniel.eyeColor = "Brown";
        daniel.heightInInches = 72;

        daniel.speak();
        daniel.walk();
        daniel.working();
        daniel.eat();
        daniel.working();
        daniel.headingHome();
        daniel.sleeping();

    }
}
