public class Lab_89_GeometryNSidedRegularPolygon {
    /** Main method */
    public static void main(String[] args) {
        // Create object1 ref
        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
        // Output result to console
        System.out.println(regularPolygon1.getPerimeter() +
                "\t" + regularPolygon1.getArea());
        // Object 2 ref
        RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
        // Output
        System.out.println(regularPolygon2.getPerimeter() +
                "\t" + regularPolygon2.getArea());
    }
}

/** Class with calculations */
class RegularPolygon {
    // Input parameters
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //No args constructor for creating an object
    RegularPolygon() {

    }
    // Overloaded constructor with two parameters
    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    // Overloaded constructor with four parameters
    RegularPolygon(int n, double side, double x, double y) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.side = side;
    }

    // Getters and Setters for access to parameters outside the class
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to get Perimeter of polygon
    public double getPerimeter(){
        return n * side;
    }

    // Method to get Area of polygon
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
