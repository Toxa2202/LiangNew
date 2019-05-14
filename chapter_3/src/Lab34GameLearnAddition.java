import java.util.Scanner;

public class Lab34GameLearnAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = (int) (System.currentTimeMillis() % 100);
        int second = (int) (System.currentTimeMillis() * 4 % 100);
        int sum = first + second;
        System.out.println("Enter the sum of these two integers: " + first + " " + second);
        int userInput = input.nextInt();

        System.out.println((sum == userInput) ? " Correct!" : " Wrong!");
    }
}
