import java.util.Scanner;

/**
 * Created by anton.sviatov on 17.06.2019.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter color of triangle: ");
        String color = input.nextLine();
        System.out.println("Fill the triangle(y/n)? ");
        boolean filled = (input.next().equals("y") ? true : false);
        Triangle t1;
        try {
            t1 = new Triangle(side1, side2, side3, color, filled);
            System.out.println(t1);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() throws IllegalTriangleException {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkTriangle();
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkTriangle();
    }

    private void checkTriangle() throws IllegalTriangleException {
        if (side1 + side2 < side3) {
            throw new IllegalTriangleException(side3, side1, side2);
        }

        if (side1 + side3 < side2) {
            throw new IllegalTriangleException(side2, side1, side3);
        }

        if (side3 + side2 < side1) {
            throw new IllegalTriangleException(side1, side3, side2);
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(double side1, double side2, double side3) {
        if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {
            return -1;
        }
    }

    public double getPerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public String toString() {
        return super.toString() + "\nTriangle: side1 = " + side1 +
                " side2 = " + side2 + " side3 = " + side3;
    }

}

class IllegalTriangleException extends Exception {
    double bigSide;
    double smallSide1;
    double smallSide2;

    public IllegalTriangleException(double bigSide, double smallSide1, double smallSide2) {
        this.bigSide = bigSide;
        this.smallSide1 = smallSide1;
        this.smallSide2 = smallSide2;
    }

    @Override
    public String getMessage() {
        return "side(" + bigSide + ") is bigger than 2 other sides("
                        + smallSide1 + " + " + smallSide2 + ")";
    }
}
