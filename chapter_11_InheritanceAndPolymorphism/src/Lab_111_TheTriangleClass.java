import java.util.*;

public class Lab_111_TheTriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("A color: ");
        String color = input.next();

        System.out.print("Triangle is filled: 'y' or 'n'? ");
        boolean filled = (input.next().equals("y") ? true : false);

        Triangle userInput = new Triangle(side1, side2, side3, color, filled);
        System.out.println(userInput + "\nThe area is " + userInput.getArea(side1, side2, side3) +
                        "\nThe perimeter is " + userInput.getPerimeter(side1, side2, side3));
//        userInput.setColor(color);
//        userInput.setFilled(filled);

//        System.out.println("The area is: " + userInput.getArea(side1, side2, side3) +
//                "\nThe perimeter is: " + userInput.getPerimeter(side1, side2, side3) +
//                "\nThe color is: " + userInput.getColor() +
//                "\nAnd is the triangle filled: " + userInput.isFilled());
    }
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
