import java.util.Scanner;

public class Lab_62_ReverseTheNumbersEntered {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        // Input user numbers
        int[] userInput = new int[10];
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = input.nextInt();
        }
        // Get swap numbers
        reverse(userInput);
    }
    /** Method, that swap numbers in reverse order */
    private static void reverse(int[] user) {
        for (int i = user.length -1; i >= 0; i--) {
            System.out.print(user[i] + " ");;
        }
        System.out.println();
    }
}
