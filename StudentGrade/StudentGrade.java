
package HomeWork.StudentGrade;
import java.util.ArrayList;

public class StudentGrade {
    private String id;
    private String name;
    private ArrayList<Double> grades;

    public StudentGrade(String id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade.");
        }
    }

    public double getAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }

    public void addInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}