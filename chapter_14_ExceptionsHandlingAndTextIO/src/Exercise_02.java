import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anton.sviatov on 02.06.2019.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueAsk = true;
        while (continueAsk) {
            try {
                System.out.println("Enter x: ");
                int x = input.nextInt();
                System.out.println("Enter y: ");
                int y = input.nextInt();
                System.out.println("Sum of x and y is: " + (x + y));
                continueAsk = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Try again...");
                input.nextLine();
            }
        }
    }
}
