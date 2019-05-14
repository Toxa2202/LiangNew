public class Lab_104_TheMPointClass {
    public static void main(String[] args) {
        MyPoint point =  new MyPoint();
        System.out.println("The distance is: " + new MyPoint(0, 0).distance(10, 30.5));
    }
}

class MyPoint {
    private double x, y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}