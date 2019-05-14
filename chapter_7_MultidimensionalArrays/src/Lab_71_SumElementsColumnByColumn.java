import java.util.Scanner;

public class Lab_71_SumElementsColumnByColumn {
    public static void main(String[] args) {
        double[][] matrix = matrixFill();
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " +
                    col + " is " + sumColumn(matrix, col));
        }
    }

    private static double[][] matrixFill() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] matrix = new double[ROWS][COLUMNS];
        System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    private static double sumColumn(double[][] matrix, int columnIndex) {
        double sumColumn = 0;
        for (int row = 0; row < matrix.length; row++) {
            sumColumn += matrix[row][columnIndex];
        }
        return sumColumn;
    }
}
