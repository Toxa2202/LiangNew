import java.util.Scanner;

public class Lab21CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
    }
}
