import java.util.Scanner;

public class Lab_91_CheckSSN {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Social Security number in the format DDD-DD-DDDD :\n(D is digit)");
        String userInput = input.nextLine(); // User input ssn

        // Result on the screen through IF
        System.out.println(isValidSSN(userInput) ? "Valid SSN" : "Invalid SSN");
    }

    // Check if userInput is correct
    private static boolean isValidSSN(String userInput) {
        // userInput must be 11 characters
        if (userInput.length() != 11) {
            return false;
        }
        // userInput must contain '-' in position 3
        if (userInput.charAt(3) != '-') {
            return false;
        }
        // userInput must contain '-' in position 6
        if (userInput.charAt(6) != '-'){
            return false;
        }
        // Create new string without including '-' symbols (only digits)
        String newString = userInput.substring(0, 3) + userInput.substring(4, 6) + userInput.substring(7);
        // FOR inspect String if every symbol isDigit
        for (int i = 0; i < newString.length(); i++) {
            if (!Character.isDigit(newString.charAt(i))) {
                return false;
            }
        }
        // Everything is OK so return TRUE
        return true;
    }
}
