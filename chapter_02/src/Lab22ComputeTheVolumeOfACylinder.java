import java.util.Scanner;

public class Lab22ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and lenth of a cylinder: ");
        double radius = input.nextDouble();
        double lenth = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * lenth;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
