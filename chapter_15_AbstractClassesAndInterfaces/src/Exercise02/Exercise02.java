package Exercise02;

import java.util.Scanner;

/**
 * Created by anton.sviatov on 19.07.2019.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter color of triangle: ");
        String color = input.next();
        System.out.print("Fill triangle(y/n)? ");
        boolean filled = (input.next().equals("y"));
        Triangle t1 = new Triangle(side1, side2, side3, color, filled);
        System.out.println(t1);
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
    }
}
