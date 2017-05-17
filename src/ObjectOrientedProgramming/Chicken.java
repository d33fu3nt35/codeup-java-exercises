package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class Chicken extends Bird {

    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly(){
        System.out.println("Chicken's can't fly!");
    }
}
