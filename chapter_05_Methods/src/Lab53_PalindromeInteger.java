import java.util.Scanner;

public class Lab53_PalindromeInteger {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome.
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }

    /** Method isPalindrome returns true if number is a palindrome */
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    /** Method reverse returns the reversal of an integer */
    public static int reverse(int number) {
        String reverse = ""; 	// Holds reversed number
        String n = number + ""; // Convert number to string
        // Перебираємо наше значення, починаючи з кінця. Заносимо в строку reverse
        for (int i = n.length() - 1; i >= 0; i--) {
            // Заносимо в строку кожен символ значення (1-ша цифра, 2-га і т. д.) через charAt()
            reverse = reverse + n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }
}
