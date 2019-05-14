import java.util.Scanner;

public class Lab_92_CheckSubstrings {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        // Input two strings
        String firstInput = input.nextLine();
        String secondInput = input.nextLine();
        // Output result
        System.out.println(isSubstring(firstInput, secondInput) ? "Is a substring!" : "Is not a substring.");
    }
    // Method checks whether one string is a substring of another
    private static boolean isSubstring(String firstInput, String secondInput) {
        String bigString, lowString;
        if (firstInput.length() > secondInput.length()) {
            bigString = firstInput;
            lowString = secondInput;
        } else {
            bigString = secondInput;
            lowString = firstInput;
        }

        if (bigString.indexOf(lowString) < 0) {
            return false;
        }
        return true;
    }
}
