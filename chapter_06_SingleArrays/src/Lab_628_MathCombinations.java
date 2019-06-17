import java.util.Scanner;

public class Lab_628_MathCombinations {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        int[] userInput = new int[10];
        // Fill array from user input
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = input.nextInt();
        }
        // Method with combinations
        displayCombinations(userInput);
    }
    /** Method show all combinations of two non repeated integers */
    private static void displayCombinations(int[] userInput) {
        for (int i = 0; i < userInput.length; i++) {
            for (int j = 0; j < userInput.length; j++) {
                // Umova na ne povtorennya. Perebraly masyv dvoma FOR
                if (i != j) {
                    System.out.print(userInput[i] + " " + userInput[j] + "   ");
                }
            }
            System.out.println();
        }
    }
}
