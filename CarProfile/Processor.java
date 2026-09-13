package HomeWork.CarProfile;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter make: ");
        String make = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        car car = new car(make, model, year);
        car.displayProfile();
    }
}
