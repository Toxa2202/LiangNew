import java.util.Scanner;

public class Lab39Business {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int userInput = input.nextInt();
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        d9 = userInput % 10;
        d8 = userInput / 10 % 10;
        d7 = userInput / 100 % 10;
        d6 = userInput / 1000 % 10;
        d5 = userInput / 10000 % 10;
        d4 = userInput / 100000 % 10;
        d3 = userInput / 1000000 % 10;
        d2 = userInput / 10000000 % 10;
        d1 = userInput / 100000000 % 10;

        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (d10 == 10){ ;
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }

    }
}
