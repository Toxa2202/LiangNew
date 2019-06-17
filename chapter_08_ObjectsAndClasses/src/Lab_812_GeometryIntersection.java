import java.util.Scanner;

public class Lab_812_GeometryIntersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the endpoints of the first line segments: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter te endpoints of the second line segments: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = 1 / (y2 - y1);
        double b = - 1 / (x2 - x1);
        double c = 1 / (y4 - y3);
        double d = - 1 / (x4 - x3);
        double e = y1 / (y2 - y1) - x1 / (x2 - x1);
        double f = y3 / (y4 - y3) - x3 / (x4 - x3);

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable()) {
            System.out.println("The intersecting point is: (" + linearEquation.getX() +
                    ", " + linearEquation.getY() + ")");
        } else {
            System.out.println("The equation has no solution");
        }
    }
}


