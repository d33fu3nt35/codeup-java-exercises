/**
 * Created by daniel on 5/11/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {

        System.out.println("ADDITION");
//        ADDITION
        double x = 1;
        double y = 9;
        double addanswer = addition(x, y);
        System.out.println(addanswer);
        addanswer = addition(20, 5);
        System.out.println(addanswer);

        System.out.println("SUBTRACTION");
//        SUBTRACTION
        double subanswer;
        x = 5;
        y = 4;
        subanswer = subtraction (x, y);
        System.out.println(subanswer);
        subanswer = subtraction(10, 5);
        System.out.println(subanswer);

        System.out.println("DIVISION");
//        DIVISION
        double divanswer;
        x = 10;
        y = 5;
        divanswer = division (x, y);
        System.out.println(divanswer);
        divanswer = division(20, 5);
        System.out.println(divanswer);


        System.out.println("MULTIPLICATION");
//        MULTIPLICATION
        double multianswer;
        x = 10;
        y = 15;
        multianswer = multiplication (x, y);
        System.out.println(multianswer);
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
        x = 50;
        y = 5;
        modanswer = modulus (x, y);
        System.out.println(modanswer);
        modanswer = modulus( 100, 10);
        System.out.println(modanswer);



    }

    public static double addition(double x, double y){
        return x + y;
    }

    public static double subtraction(double x, double y){
        return x - y;
    }

    public static double division(double x, double y){
        return x / y;
    }

    public static double multiplication(double x, double y){
        double multianswer = 0;
        for (int counter = 1; counter <= y; counter++){
            multianswer = multianswer + x;
        }
        return multianswer;
    }

    public static double modulus(double x, double y){
        return x % y;
    }
}
