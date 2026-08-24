package Lec06;

import java.util.Scanner;

public class Sentinel_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;
        int count = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();

            if (number != 0) {
                sum += number;
                count++;
            }

        } while (number != 0);

        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Count: " + count);
            System.out.println("Average: " + (sum / count));
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}