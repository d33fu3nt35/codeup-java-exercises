package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by daniel on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();


        Student Daniel = new Student("Daniel");
        Daniel.addGrade(65);
        Daniel.addGrade(37);
        Daniel.addGrade(76);

        Student Marc = new Student("Marc");
        Marc.addGrade(92);
        Marc.addGrade(65);
        Marc.addGrade(89);

        Student Evan = new Student("Evan");
        Evan.addGrade(100);
        Evan.addGrade(98);
        Evan.addGrade(62);

        Student Emilio = new Student("Emilio");
        Emilio.addGrade(57);
        Emilio.addGrade(90);
        Emilio.addGrade(98);

        students.put("d33fu3nt35", Daniel);
        students.put("markymarc", Marc);
        students.put("syee4sev", Evan);
        students.put("docalvi", Emilio);

        do {
            System.out.println("Here are the github usernames of our students:\n");

            students.forEach((key, value) -> {
                System.out.print(" | " + key + " | ");
            });

            System.out.println("\n \nWhat student would you like to see more information on? Or type View All! \n");

            Scanner optionScan = new Scanner(System.in);
            String input = optionScan.nextLine();
            if (input.equalsIgnoreCase("View All")) {
                students.forEach((key, value) -> {
                    System.out.println(" | " + key + " | " + value.getGrades() + "\n");
                });
            } else if (students.get(input) == null) {
                System.out.println("Sorry, no student found with the Github username of " + input + "\n");
            } else {
                Student student = students.get(input);
                System.out.println("Name: " + student.getName() + "\n" + "Github Username: " + input + "\n" + "Current Average: " + student.getGradeAverage() + "\n" + "Grades: " + student.getGrades());
            }

            System.out.println("Would you like to see another student? Y/N");
            String again = optionScan.next();
            if (!again.toLowerCase().equals("y")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }

        } while (true);
    }
}


//    Scanner optionScan = new Scanner(System.in);
//        do {
//        System.out.println("Here are the github usernames of our students:\n");
//
//
//
//        System.out.println("What student would you like to see more information on?:\n");
//
//        int input = optionScan.nextInt();
//
//        }
