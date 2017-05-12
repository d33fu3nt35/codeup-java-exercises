import java.util.Scanner;

/**
 * Created by daniel on 5/11/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
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


    }

    public static double getdouble(double min, double max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " & " + max);
        double userInput = scan.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else{
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
}
