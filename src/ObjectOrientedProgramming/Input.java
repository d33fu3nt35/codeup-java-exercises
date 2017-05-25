package ObjectOrientedProgramming;

import java.util.Scanner;

/**
 * Created by daniel on 5/17/17.
 */
public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString() {
        return scan.nextLine();
    }

    public boolean yesNo() {
        String answer = this.getString();

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        }

        return false;
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.getString());
        } catch(NumberFormatException e) {
            System.out.println("You didn't enter an Integer!\nEnter Integer Here: ");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int num = 0;
        try{
            String possibleNumber = this.getString();
            num = Integer.valueOf(possibleNumber);
        }catch (NumberFormatException e) {
            System.out.println("You didn't enter an Integer!\nEnter Integer Here Between " + min + " & " + max + ": ");
            return getInt(min, max);
        }

//        int num = this.getInt();

        if (num >= min && num <= max) {
            return num;
        }

        System.out.println(num + " is out of range!");
        return getInt(min, max);

    }

    public double getDouble() {
        return scan.nextDouble();
    }

    public double getDouble(double min, double max) {
        double num = this.getDouble();

        if (num >= min && num <= max) {
            return num;
        }

        System.out.println(num + " is out of range!");
        return getDouble(min, max);

    }

    public static void main(String[] cheese) {
        Input input = new Input();
        System.out.println("Enter A Number Between 20 & 30: ");
        int userInput = input.getInt(20, 30);
        System.out.println("You entered " + userInput + "!");
    }

}
