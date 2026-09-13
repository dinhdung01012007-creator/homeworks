
package HomeWork.StudentGrade;
public class Processor {
    public static void main(String[] args) {

        StudentGrade student = new StudentGrade("SV001", "Dung");

        student.addGrade(8.0);
        student.addGrade(7.5);
        student.addGrade(9.0);
        student.addGrade(6.5);

        student.display();

        System.out.println();

        student.addInfo();
    }
}