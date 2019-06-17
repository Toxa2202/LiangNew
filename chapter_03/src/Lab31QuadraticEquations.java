import java.util.Scanner;

public class Lab31QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1, r2;

        if ((Math.pow(b, 2) - 4 * a * c) > 0){
            r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
            r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if ((Math.pow(b, 2) - 4 * a * c) == 0) {
            r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
