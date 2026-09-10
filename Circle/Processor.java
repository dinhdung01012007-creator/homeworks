/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08.Circle;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

    }
}