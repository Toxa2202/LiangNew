import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by anton.sviatov on 24.06.2019.
 */
public class Exercise_16 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise_16 sourceFile oldStr newStr");
            System.exit(1);
        }

        String sourceFileName = args[0];
        File sourceFile = new File(sourceFileName);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + sourceFileName + " does not exists");
            System.exit(2);
        }

        String targetFileName = sourceFileName + ".tmp";
        File targetFile = new File(targetFileName);

        // Create input and output files
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(targetFile);

        while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[1], args[2]);
            output.println(s2);
        }

        input.close();
        output.close();

        if (sourceFile.delete()) {
            targetFile.renameTo(sourceFile);
        } else {
            System.out.println("Error writing file");
            System.exit(3);
        }
    }
}