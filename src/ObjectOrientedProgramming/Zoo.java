package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class Zoo {

    public static void main(String[] args) {
        Animal Lion = new Animal( 5, "M", 300);
        System.out.println("The lion is..");
        Lion.eat();
        System.out.println("& now he's..");
        Lion.sleep();

        Bird Sparrow = new Bird(3, "F", 5);
        System.out.println("The sparrow is..");
//        Sparrow.fly();
        System.out.println("& now he is..");
        Sparrow.eat();
        System.out.println("& now he is..");
        Sparrow.sleep();

        Fish Bass = new Fish(5, "M", 3);
        System.out.println("The bass is..");
        Bass.swim();
        System.out.println("The bass is now..");
        Bass.eat();

        Chicken chick1 = new Chicken(1, "M", 4);
        System.out.println("The chicken wants to fly but..");
        chick1.fly();

        MockingBird MockingBird1 = new MockingBird(2, "F", 3);
        MockingBird1.fly();

        }

    }
