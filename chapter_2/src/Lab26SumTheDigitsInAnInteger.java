import java.util.Scanner;

public class Lab26SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int userInput = input.nextInt();

        int hundreds, tens, ones, result;

        if (userInput >= 100 && userInput < 1000){
            hundreds = userInput / 100;
            tens = userInput / 10 % 10;
            ones = userInput % 10;
            result = hundreds + tens + ones;
            System.out.println("The sum of the integers is " + result);
        } else if (userInput >= 10 && userInput < 100) {
            tens = userInput / 10;
            ones = userInput % 10;
            result = tens + ones;
            System.out.println("The sum of the integers is " + result);
        } else if (userInput < 10) {
            System.out.println("The sum of the integers is " + userInput);
        } else {
            System.out.println("Wrong integer!");
        }
    }
}
