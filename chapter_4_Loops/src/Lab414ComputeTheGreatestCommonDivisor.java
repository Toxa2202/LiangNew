import java.util.Scanner;

public class Lab414ComputeTheGreatestCommonDivisor {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first positive integer: ");
        int firstInt = input.nextInt();
        System.out.println("Enter second positive integer: ");
        int secondInt = input.nextInt();
        //start gcd
        int gcd = 1;

        //finding smallest user input
        if (firstInt < secondInt) {
            gcd = firstInt;
        } else {
            gcd = secondInt;
        }

        //finding gcd
        while (firstInt % gcd != 0 || secondInt % gcd != 0) {
            gcd--;
        }

        //If user enter wrong numbers
        if (gcd > 1) {
            System.out.println("The greatest common divisor for " + firstInt + " and " + secondInt + " is " + gcd);
        } else {
            System.out.println("Can't find any gcd. Try with another integers.");
        }
    }
}
