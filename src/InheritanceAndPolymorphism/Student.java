package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class Student extends Person {

    private String cohort;
    private String backendLanguage;

    public Student(String name, int age, char gender, String cohort, String backendLanguage) {
        super(name, age, gender);
        this.name = name.toUpperCase();
        this.cohort = cohort;
        this.backendLanguage = backendLanguage;
    }

    @Override // Annotation
    public String description() {
        return super.description() + " Cohort: " + cohort + " Language: " + backendLanguage;
    }
}
