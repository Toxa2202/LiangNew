import java.util.Scanner;

public class Lab52_SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        // Ask user to enter some integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = input.nextInt();
        // Write result on the screen
        System.out.println("The sum of digits of the number " + userInput + " is " + sumDigits(userInput));
    }

    // Get sum of digits
    public static int sumDigits(int number){
        int sumOfDigits = 0;

        while (number != 0){
            if (number < 10){
                sumOfDigits = sumOfDigits + number;
                number = 0;
            } else {
                sumOfDigits = sumOfDigits + (number % 10);
                number = number / 10;
            }
        }
        return sumOfDigits;
    }
}
