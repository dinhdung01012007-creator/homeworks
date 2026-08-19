package lec04 ;

import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem tong ket: ");
        double Point = scanner.nextDouble();
        if (Point > 5) {
            System.out.println("Dat!");
        } else {
            System.out.println("Khong dat!");
        }
    }
}