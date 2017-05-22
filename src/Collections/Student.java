package Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 5/22/17.
 */
public class Student {
    public static void main(String[] args) {
        Student students = new Student("Daniel");
        students.addGrade(50);
        students.addGrade(37);
        students.addGrade(76);

        System.out.println("The Grade Average For Daniel Is: " + students.getGradeAverage());

    }

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List getGrades(){
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;

        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }

        return sum / grades.size();
    }

}
