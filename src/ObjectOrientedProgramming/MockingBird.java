package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class MockingBird extends Bird implements Flyable {
    public MockingBird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Mocking bird is flying..");

    }
}
