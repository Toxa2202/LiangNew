import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by anton.sviatov on 19.06.2019.
 */
public class Exercise_15 {
    public static void main(String[] args) throws FileNotFoundException {
        final int SIZE = 100;
        File file = new File("tmp/Exercise14_15.txt");
        PrintWriter output = new PrintWriter(file);
        // write to file 100 random integers
        for (int i = 0; i < SIZE; i++) {
            output.print((int)(Math.random() * Integer.MAX_VALUE));
        }
        output.close();

        // read from file and store data to new array
        Scanner input = new Scanner(file);
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        // sort collected data in array
        java.util.Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
