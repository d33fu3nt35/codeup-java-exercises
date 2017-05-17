import java.util.Scanner;

/**
 * Created by daniel on 5/11/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double min = 1;
        double max = 15;
        System.out.println("ADDITION");
//        ADDITION
        double x = getdouble(min, max);
        double y = getdouble(min, max);
        double addanswer = addition(x, y);
        System.out.println(addanswer);
        addanswer = addition(20, 5);
        System.out.println(addanswer);

        System.out.println("SUBTRACTION");
//        SUBTRACTION
        double subanswer;
        x = getdouble(min, max);
        y = getdouble(min, max);
        subanswer = subtraction(x, y);
        System.out.println(subanswer);
        subanswer = subtraction(10, 5);
        System.out.println(subanswer);

        System.out.println("DIVISION");
//        DIVISION
        double divanswer;
        x = getdouble(min, max);
        y = getdouble(min, max);
        divanswer = division(x, y);
        System.out.println(divanswer);
        divanswer = division(20, 5);
        System.out.println(divanswer);


        System.out.println("MULTIPLICATION");
//        MULTIPLICATION
        double multianswer;
        x = getdouble(min, max);
        y = getdouble(min, max);
        System.out.println("FOR LOOP");
        multianswer = multiplication(x, y);
        System.out.println(multianswer);
        System.out.println("RECURSION");
        multianswer = multiplicationrecursion(x, y);
        System.out.println(multianswer);
        System.out.println("HARDCODE");
        multianswer = multiplication(20, 5);
        System.out.println(multianswer);

//        answer = 0;
//        for (int counter = 1; counter <= y; counter++){
//            answer = answer + x;
//        }

//        answer = 0;
//        for (int counter = 1; counter <= y; counter++){
//            answer = answer + x;
//        }


        System.out.println("MODULUS");
        // MODULUS
        double modanswer;
        x = getdouble(min, max);
        y = getdouble(min, max);
        modanswer = modulus(x, y);
        System.out.println(modanswer);
        modanswer = modulus(100, 10);
        System.out.println(modanswer);


        System.out.println("FACTORIAL");
//        FACTORIAL
        String Yes;
        do {
            double factorialmath;
            x = getdouble(min, max);
            factorialmath = factorial(x);
            System.out.println(factorialmath);
            System.out.println("Do you want to continue? Yes, or No?");
            Yes = scan.nextLine();
        } while (Yes.equalsIgnoreCase("Yes"));


        System.out.println("DICE GAME");
//        DICE GAME
        System.out.println("Do you want to roll some dice? Yes / No");
        Yes = scan.nextLine();
        while (Yes.equalsIgnoreCase("Yes")) {
            int dicegame;
            dicegame = dicesides();
            System.out.println(dicegame(1, dicegame));
            System.out.println(dicegame(1, dicegame));
            System.out.println("Do you want to roll again? Yes / No");
            Yes = scan.nextLine();
        } // while (Yes.equalsIgnoreCase("Yes"))

    }

    public static double getdouble(double min, double max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " & " + max);
        double userInput = scan.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid number, try again.");
            return getdouble(min, max);
        }
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double multiplication(double x, double y) {
        double multianswer = 0;
        for (int counter = 1; counter <= y; counter++) {
            multianswer = multianswer + x;
        }
        return multianswer;
    }

    public static double factorial(double y) {
        double factorialmath = 1;
        for (int counter = 1; counter <= y; counter++) {
            factorialmath = factorialmath * counter;
        }
        return factorialmath;
    }

    public static double multiplicationrecursion(double x, double y) {
        if (y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else if (y == 2) {
            return x * x;
        }
        return x * multiplicationrecursion(x, y - 1);
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

    public static int dicegame(int min, int max) {
        int dice = (int) (Math.round(Math.random() * (max - min)) + min);
        return dice;
    }

    public static int dicesides() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int userInput = scan.nextInt();
        if (userInput >= 1) {
            return userInput;
        } else {
            System.out.println("Invalid number, try again.");
            return dicesides();
        }
    }
}
