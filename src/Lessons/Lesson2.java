package Lessons;
import java.util.Scanner;

/**
 * Created by daniel on 5/10/17.
 */
public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any number here: ");
        int user_input_number = scan.nextInt();

        System.out.println("The entered value is: ");
        System.out.print(user_input_number);

        Scanner scanNext = new Scanner (System.in);
        System.out.println("Enter some string here: ");
        String user_input_string = scanNext.nextLine();

        System.out.println("The entered string is: ");
        System.out.print(user_input_string);

    }
}
