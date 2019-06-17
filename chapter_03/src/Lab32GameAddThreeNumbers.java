import java.util.Scanner;

public class Lab32GameAddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (System.currentTimeMillis() % 10);
        int b = (int) (System.currentTimeMillis() * 7 % 10);
        int c = (int) (System.currentTimeMillis() * 5 % 10);
        int sum = a + b + c;
        System.out.println("Enter the sum of " + a + ", " + b + " and " + c);
        int userInput =  input.nextInt();

        if (sum == userInput) {
            System.out.println("Correct! It's " + sum);
        } else {
            System.out.println("Wrong! The answer was " + sum);
        }

    }
}
