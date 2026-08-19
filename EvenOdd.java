package lec04;

import java.util.Scanner;

public class EvenOdd {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number %2==0){
            System.out.println("this is even number");
        }    else {
            System.out.println("this is odd number");
        }
    }
}