package Lec08.ClassicBook;
import java.util.Scanner;
public class processor {
    public static void main(String[] args) {
        Book s1 = new Book("Clean code", "Robert C.Martin", 25.0);
        Book s2 = new Book ("Effective Java", "Joshua Bloch", 30.0);
        s1.displayInfo();
        s2.displayInfo();
    }
}
