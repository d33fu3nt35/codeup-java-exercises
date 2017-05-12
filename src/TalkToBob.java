import java.util.Scanner;

/**
 * Created by daniel on 5/11/17.
 */

public class TalkToBob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Instantiation

        System.out.println("Type anything here..");
        String question = input.nextLine();


        // "123" uppercase "123"  lowercase "123"
        // "   " uppercase "  " lowercase "   "
        // "@#$" uppercase "@#$" lowercase "@#$"

        // "HI" uppercase "HI" lowercase "hi"
        // "hi" uppercase "HI" lowercase "hi"


        System.out.println(question.length());
        System.out.println(question.charAt(question.length() - 1));
        if (question.charAt(question.length() - 1) == '?') { // also question.endsWith("?")
            System.out.println("Sure.");
        } else if (question.trim().equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (question.toUpperCase().equals(question) && !question.toLowerCase().equals(question)) { // verfying you're using at least one character/word
            System.out.println("Whoa, chill out!");
        } else{
            System.out.println("Whatever.");
        }
    }
}
