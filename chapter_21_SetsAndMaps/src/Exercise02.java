import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by anton.sviatov on 08.08.2019.
 */
public class Exercise02 {
    public static void main(String[] args) throws FileNotFoundException {

        // Check whether console doesn't send file to the program
        if (args.length != 1) {
            System.out.println("Usage: java Exercise02 fileName");
            System.exit(0);
        }

        // Checks whether file is exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File \"" + args[0] + "\" does not exists");
            System.exit(0);
        }

        // If OK scan file for String data
        Scanner input = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        // Collect file data to the sorted TreeSet
        while (input.hasNext()) {
            String tmp = input.next();
            set.add(tmp);
        }
        input.close();

        // Show result on the screen
        for (String string : set) {
            System.out.println(string);
        }
    }
}
