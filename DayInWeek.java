package Lec05;

import java.util.Scanner;

public class DayInWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number from 1 to 7");
        int number = scanner.nextInt();
        toString(number);
    }

    public static void toString(int number) {
        switch (number) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }

    }
}
