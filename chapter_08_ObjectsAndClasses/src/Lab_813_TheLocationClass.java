import java.util.Scanner;

public class Lab_813_TheLocationClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and  columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] userInput = new double[rows][columns];
        for (int i = 0; i < userInput.length; i++) {
            for (int j = 0; j < userInput[i].length; j++) {
                userInput[i][j] = input.nextDouble();
            }
        }

        Location loc = Location.locationLargest(userInput);
        System.out.println("The location of the largest element is " +
                loc.maxValue + " at (" + loc.row  + ", " + loc.column + ")");
    }
}

class Location {
    public int row, column;
    public double maxValue;

    public static Location locationLargest(double[][] userInput){
        Location loc = new Location();
        loc.maxValue = userInput[0][0];
        loc.row = 0;
        loc.column = 0;
        for (int i = 0; i < userInput.length; i++) {
            for (int j = 0; j < userInput[i].length; j++) {
                if (userInput[i][j] > loc.maxValue){
                    loc.maxValue = userInput[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }
}