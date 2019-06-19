import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by anton.sviatov on 19.06.2019.
 */
public class Exercise_14 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        Scanner inputFile = new Scanner(new File(fileName));
        int sum = 0;
        int count = 0;
        while (inputFile.hasNext()) {
            // read integer from file
            sum += inputFile.nextInt();
            count++;
        }
        inputFile.close();
        System.out.println("Total: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + sum / (double)count);
    }
}
