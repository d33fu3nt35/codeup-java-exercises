package InheritanceAndPolymorphism;

public class Person {

    protected String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String description() {
        return String.format("This is %s and he/she is %d years old", name, age);
    }
}

//    public static void main(String[] args) {
//        Person person = new Person("Daniel", 21, 'M');
//        System.out.println(person.description());
//        Student student = new Student("Bob", 30, 'M', "Pinnacles",
//                "Java");
//        System.out.println(student.description());
//    }
//}

//class Student extends Person {
//    private String cohort;
//    private String backendLanguage;
//
//    public Student(String name, int age, char gender, String cohort, String backendLanguage) {
//        super(name, age, gender);
//        this.name = name.toUpperCase();
//        this.cohort = cohort;
//        this.backendLanguage = backendLanguage;
//    }
//
//    @Override // Annotation
//    public String description() {
//        return super.description() + " Cohort: " + cohort + " Language: " + backendLanguage;
//    }
//}
