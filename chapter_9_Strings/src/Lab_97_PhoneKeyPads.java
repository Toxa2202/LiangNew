import java.util.Scanner;

public class Lab_97_PhoneKeyPads {
    // Main method
    public static void main(String[] args) {
        // User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number as a string: ");
        String userInput = input.nextLine();
        // Get every symbol from user input and show them in the output
        for (int i = 0; i < userInput.length(); i++) {
            int tmp = getNumber(userInput.charAt(i));
            if (tmp == -1) {
                System.out.print(userInput.charAt(i));
            } else {
                System.out.print(tmp);
            }
        }

    }

    // Method compare userInput to numbers and parse them
    private static int getNumber(char upperCaseLetter) {
        // Convert every letter in lowerCase format for easy calculation
        upperCaseLetter = Character.toLowerCase(upperCaseLetter);
        // If char is digit - return in to Main. No need to compare
        if (Character.isDigit(upperCaseLetter)) {
            return Character.getNumericValue(upperCaseLetter);
        // If is a letter - return digit from 2 to 9
        } else if (Character.isAlphabetic(upperCaseLetter)){
            if (upperCaseLetter < 's') {
                return 2 + (upperCaseLetter - 'a') / 3;
            } else {
                if (upperCaseLetter == 's') {
                    return 7;
                } else if ((upperCaseLetter == 't') || (upperCaseLetter == 'u') || (upperCaseLetter == 'v')) {
                    return 8;
                } else {
                    return 9;
                }
            }
        } else {
            return -1;
        }
    }
}
