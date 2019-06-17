import java.util.Scanner;

public class Lab_810_AlgebraQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation userInput = new QuadraticEquation(a, b, c);
        if (userInput.getDiscriminant() > 0) {
            System.out.println(userInput.getRoot1() + "\t" + userInput.getRoot2());
        } else if (userInput.getDiscriminant() == 0) {
            System.out.println(userInput.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        }
    }
}
