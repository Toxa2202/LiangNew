import java.util.Scanner;

public class Lab_612_ReverseAnArray {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");
        double[] userInput = new double[10];
        reverseArray(userInput); // Go to another method

        // Show reversed numbers
        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i] + " ");
        }
    }

    // Reversing method
    private static double[] reverseArray(double[] array) {
        Scanner input = new Scanner(System.in);
        // Input numbers from user and save them to the array in reversed order
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = input.nextDouble();
        }
        return array;
    }
}
