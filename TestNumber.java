package lec04;

import java.util.Scanner;

public class TestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 1) {
            System.out.println("this is positive integer");
        }
        if (number <= -1) {
            System.out.println("this is negative integer");
        } else {
            System.out.println("this is zero");
        }
    }
}
