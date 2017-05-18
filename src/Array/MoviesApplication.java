package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by daniel on 5/18/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] allmovies = MoviesArray.findAll();
        Scanner optionScan = new Scanner(System.in);
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit\n" +
                    "1 - View all movies\n" +
                    "2 - View movies in the animated category\n" +
                    "3 - View movies in the drama category\n" +
                    "4 - View movies in the horror category\n" +
                    "5 - View movies in the scifi category\n" +
                    "6 - Add movie to the list\n");

            int input = optionScan.nextInt();
            if (input == 0) {

                System.exit(0);

            } else if (input == 1) {


                for (int i = 0; i < allmovies.length; i++) {
                    System.out.println(allmovies[i].getName() + " -- " + allmovies[i].getCategory());
                }

            } else if (input == 2) {
                for (int i = 0; i < allmovies.length; i++) {
                    if ("animated".equalsIgnoreCase(allmovies[i].getCategory())) {
                        System.out.println(allmovies[i].getName() + " -- " + allmovies[i].getCategory());
                    }
                }
            } else if (input == 3) {
                for (int i = 0; i < allmovies.length; i++) {
                    if ("drama".equalsIgnoreCase(allmovies[i].getCategory())) {
                        System.out.println(allmovies[i].getName() + " -- " + allmovies[i].getCategory());
                    }
                }
            } else if (input == 4) {

                for (int i = 0; i < allmovies.length; i++) {
                    if ("horror".equalsIgnoreCase(allmovies[i].getCategory())) {
                        System.out.println(allmovies[i].getName() + " -- " + allmovies[i].getCategory());
                    }
                }
            } else if (input == 5) {
                for (int i = 0; i < allmovies.length; i++) {
                    if ("scifi".equalsIgnoreCase(allmovies[i].getCategory())) {
                        System.out.println(allmovies[i].getName() + " -- " + allmovies[i].getCategory());
                    }
                }
            } else if (input == 6) {
                optionScan.nextLine();
                System.out.println("Enter movie name, please.");
                String name = optionScan.nextLine();

                System.out.println("Enter movie category, please.");
                String category = optionScan.nextLine();

                allmovies = Arrays.copyOf(allmovies, allmovies.length +1);
                allmovies[allmovies.length -1] = new Movie(name, category);
            }

        } while (true);
    }
}
