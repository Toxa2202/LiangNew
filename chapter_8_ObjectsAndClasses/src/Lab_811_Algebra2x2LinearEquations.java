import java.util.Scanner;

public class Lab_811_Algebra2x2LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e and f: ");
        LinearEquation user = new LinearEquation(input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        if (user.isSolvable()) {
            System.out.println("X = " + user.getX() + ", Y = " + user.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}

class LinearEquation {
    private double a, b, c, d, e, f;

    // Constructors
    public LinearEquation() {
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Methods
    public boolean isSolvable() {
        if ((a * d - b * c) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
