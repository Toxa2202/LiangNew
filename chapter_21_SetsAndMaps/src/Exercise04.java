import java.io.*;
import java.util.*;

/**
 * Created by anton.sviatov on 08.08.2019.
 */
public class Exercise04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter text file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        // D:\JAVA\LIANG\resources\txt\readme.txt

        File file = new File(fileName);
        if (file.exists()) {
            countChars(file);
        } else {
            System.out.println("File " + fileName + " does not exist");
        }
    }

    private static void countChars(File file) throws IOException {

        DataInputStream inputStream = new DataInputStream(new BufferedInputStream
                (new FileInputStream(file)));
        byte[] b = new byte[inputStream.available()];
        inputStream.read(b);
        inputStream.close();

        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < b.length; i++) {
            if (Character.isAlphabetic((char)(b[i]))) {
                if (vowelsSet.contains(Character.toLowerCase((char)(b[i])))) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Vowels " + vowelsCount);
        System.out.println("Consonants " + consonantsCount);
    }
}
