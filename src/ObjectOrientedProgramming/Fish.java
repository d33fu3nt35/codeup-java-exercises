package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class Fish extends Animal {
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
