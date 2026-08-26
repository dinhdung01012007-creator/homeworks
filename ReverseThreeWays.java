package Lec06;

import java.util.Scanner;

public class ReverseThreeWays {

    public static int[] reverse1(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    public static void reverse2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void reverse3(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);

        int[] result1 = reverse1(arr);
        System.out.print("Method 1: ");
        printArray(result1);

        int[] result2 = arr.clone();
        reverse2(result2);
        System.out.print("Method 2: ");
        printArray(result2);

        int[] result3 = arr.clone();
        reverse3(result3);
        System.out.print("Method 3: ");
        printArray(result3);

        sc.close();
    }
}
