package Lessons;

/**
 * Created by daniel on 5/10/17.
 */
public class Lesson7 {
    public static void main (String[] args) {
        int score = 621;
        // byte, short, int, or char.

            if  (score >= 90  && score <= 100)
                System.out.println("Very Good!");
            else if  (score >= 60 && score <= 90)
            System.out.println("Good!");
            else if (score >= 40 && score <= 60)
                System.out.println("OK!");
            else if  (score >= 20 && score <= 40)
                System.out.println("Bad!");
            else
                System.out.println("The grades are not defined!");

    }
}
