package Array;

/**
 * Created by daniel on 5/18/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Brown", "Lewd", "Squealing", "Fragile", "Bizarre", "Forgetful", "Goofy",
                "Observant", "Sparkling", "Frail"};


//        for (int i = 0; i < adjectives.length; i++) {
//            System.out.println(adjectives[i]);

            String[] nouns = {"Attitude", "Ballet", "Comic", "Cough", "Dirt", "Lemon", "Mule",
                    "Outback", "Plenty", "Purpose"};


//            for (int j = 0; j < nouns.length; j++) {
//                System.out.println(nouns[i]);

                System.out.println(adjectives[(int)(Math.random() * adjectives.length)] + " " + nouns[(int)(Math.random() * nouns.length)]);

            }
        }
