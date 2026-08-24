package Lec06;

import java.util.Random;
import java.util.Scanner;

public class SumRandomNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int wrong = 0;

        while (wrong < 3) {

            int n = random.nextInt(4) + 2;

            int sum = 0;

            System.out.print("Question: ");

            for (int i = 0; i < n; i++) {
                int number = random.nextInt(10) + 1;
                sum += number;

                System.out.print(number);

                if (i < n - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");
            int answer = sc.nextInt();
            if (answer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + sum);
                wrong++;
                System.out.println("Wrong attempts: " + wrong + "/3");
            }

            System.out.println();
        }

        System.out.println("Game over!");
        System.out.println("Your total score: " + score);

        sc.close();
    }
}