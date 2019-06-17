import java.util.Scanner;

public class Lab417DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int userLines = input.nextInt();

        for (int rows = 1; rows <= userLines; rows++){
            //Empty fields
            for (int empty = userLines - rows; empty >= 1; empty--){
                System.out.print("  ");
            }
            //Create descending numbers in each row
            for (int descending = rows; descending >= 2; descending--){
                System.out.print(descending + " ");
            }
            //Create ascending numbers in each row
            for (int ascending = 1; ascending <= rows; ascending++){
                System.out.print(ascending + " ");
            }
            //End of line
            System.out.println();
        }
    }
}
