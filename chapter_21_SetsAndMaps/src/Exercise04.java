import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int size = inputStream.available();
        byte[] b = new byte[size];
        inputStream.read(b);
        inputStream.close();

        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < b.length; i++) {
            if (Character.isAlphabetic((char)(b[i]))) {
                if (vowelsSet.contains(Character.toLowerCase((char)(b[i])))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
    }
}
