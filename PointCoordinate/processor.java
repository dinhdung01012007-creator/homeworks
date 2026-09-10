package Lec08.PointCoordinate;

import java.util.Scanner;

public class processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("distance from Origin");
        PointCoordinate p = new PointCoordinate(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(p.distanceFromOrigin());
    }
}
