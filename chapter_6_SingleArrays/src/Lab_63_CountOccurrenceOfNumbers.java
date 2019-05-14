import java.util.Scanner;

public class Lab_63_CountOccurrenceOfNumbers {
    /** Main method */
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println("Enter the integers between 1  and 100: ");
        // Fill the array method
        fill(array);

        // Display results
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                System.out.println((i + 1) + " occurs " + array[i] +
                        " time" + (array[i] > 1 ? "s" : "")); // Two variants of output ('time' or 'times')
        }

    }
    // Find repeated numbers, calculate how much and insert result of every number to the new array
    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        int num; // holds user input
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                array[num - 1]++;
        } while (num != 0);
    }
}
