import java.util.Scanner;

public class Lab_69_FindTheSmallestElement {

    /** Main method */
    public static void main(String[] args) {
        System.out.println("Enter ten double numbers: ");
        double[] array = new double[10];
        fillArray(array); // Link to method fillArray()
        System.out.println("The minimum number is: " + min(array));
    }

    /** Fill userInput to array */
    public static void fillArray(double[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
    }

    /** Find the smallest number */
    public static double min(double[] array){
        double minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber){
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}