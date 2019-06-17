import java.util.Scanner;

public class Lab_614_ComputingGDC {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Fill array
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the GDC
        System.out.println("The greatest common divisor is " + gdc(numbers));
    }

    /** Method gdc returns the gdc of an unspecified number of integers */
    private static int gdc(int... numbers) {
        int gdc = 1; // Start gdc is 1
        boolean isDivisor; // Is number a divisor

        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;
            for (int arrayNum : numbers){
                if (arrayNum % i != 0){
                    isDivisor = false;
                }
            }
            if (isDivisor){
                gdc = i;
            }
        }
        return gdc;
    }

    /** Method returns the smallest integer in an array */
    private static int min(int... numbers) {
        int min = numbers[0];
        for (int e : numbers){
            if (e < min){
                min = e;
            }
        }

        return min;
    }
}
