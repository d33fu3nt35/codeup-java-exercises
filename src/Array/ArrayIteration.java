package Array;

/**
 * Created by daniel on 5/18/17.
 */
public class ArrayIteration {
    public static void main(String[] args) {
        String[] languages = {"HTML", "CSS", "JavaScript", "Java"};

        System.out.println("I know the following languages..");
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);

        }
        //enhanced for loop

        for (String language : languages) { // for each language in languages do
            System.out.println(language);

        }

        int[] numbers = {2, 12, 23, 40, 78, 100};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        sum = 0;
        for(int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all the numbers is " + sum);


    }
}
