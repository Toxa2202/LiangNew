import java.util.Scanner;

public class Lab_610_FindTheIndexOfTheSmallestElement {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");

        double[] userInput = new double[10];

        System.out.println("The index of smallest element is "
                + indexOfSmallestElement(userInput));

    }

    private static int indexOfSmallestElement(double[] array) {
        double smallestElement = 1000000;
        int indexOfSmallestElement = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            if (array[i] < smallestElement){
                smallestElement = array[i];
                indexOfSmallestElement = i;
            }
        }
        return indexOfSmallestElement + 1;

    }
}
