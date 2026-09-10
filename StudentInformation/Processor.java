package Lec08.StudentInformation;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter ID, enter name, enter major ");
        Student s1 = new Student (scanner.nextLine(),scanner.nextLine(),scanner.nextLine());      
    s1.displayInfo();
    }
}
