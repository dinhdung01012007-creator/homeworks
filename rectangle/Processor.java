package Lec08.rectangle;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter length, enter width: ");
       rectangle r = new rectangle(scanner.nextDouble(),scanner.nextDouble());
        System.out.println("area = " +r.getArea());
        System.out.println("perimeter = " + r.getPerimeter());
    }
}
