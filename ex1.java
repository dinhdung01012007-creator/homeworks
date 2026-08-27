package Lec06;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
