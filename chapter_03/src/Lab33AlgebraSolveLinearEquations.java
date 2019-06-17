import java.util.Scanner;

public class Lab33AlgebraSolveLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, x = 0, y = 0;
        System.out.println("Enter a, b, c, d, e, f : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
