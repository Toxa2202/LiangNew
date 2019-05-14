public class Lab_1011_GeometryTheCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("The area of c1 is " + c1.getArea(c1.getRadius()) +
                " and perimeter is " + c1.getPerimeter(c1.getRadius()));
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private double x, y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(double radius) {
        return 2 * radius * Math.PI;
    }
    // If point is inside the circle
    public boolean contains(double x2, double y2) {
        double distance = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        return (distance < this.radius) ? true : false;
    }
    // If circle is inside the circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((circle.getX() - x) * (circle.getX() - x) +
                (circle.getY() - y) * (circle.getY() - y));
        return (radius > (distance + circle.getRadius())) ? true : false;
    }
    // If circle is cross the circle
    public boolean overlaps(Circle2D circle) {
        double distSq = (x - circle.getX()) * (x - circle.getX()) +
                (y - circle.getY()) * (y - circle.getY());
        double radSumSq = (radius + circle.getRadius()) * (radius + circle.getRadius());
        return (distSq <= radSumSq) ? true : false;
    }
}
