package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class InheritanceApp {

    public static void main(String[] args) {
        Person daniel = new Person("Daniel", 21, 'M');
//        System.out.println(person.description());


        Student bob = new Student("Bob", 30, 'M', "Pinnacles",
                "Java");
//        System.out.println(student.description());

        Student ryan = new Student("Ryan", 29, 'M', "Olympic", "PHP");

        Person[] people = {
                daniel,
                new Person("Ben", 20, 'M'),
                bob,
                ryan
        };
        for (Person person : people) {
            System.out.println(person.description()); // They all can call the method description
        }


        Student[] students = {
            bob,
            ryan
        };
        for (Student student : students) {
            System.out.println(student.description());
        }
    }
}
