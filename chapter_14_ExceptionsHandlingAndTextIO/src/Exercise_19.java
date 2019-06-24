import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * Created by anton.sviatov on 24.06.2019.
 */
public class Exercise_19 {
    public static void main(String[] args) {
        // prepare url
        String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
        try {
            // read url
            java.net.URL url = new java.net.URL(URLString);
            Scanner inputChar = new Scanner(url.openStream());
            int charCount = 0;  // count for chars
            int lineCount = 0;  // count for lines

            // poky je nastupnyj element
            while (inputChar.hasNext()) {
                // collect every line size
                charCount += inputChar.nextLine().length();
                // collect number of lines
                lineCount++;
            }
            inputChar.close(); // saving memory

            // collect number of words
            Scanner inputWord = new Scanner(url.openStream());
            int wordCount = 0;

            // poky je nastupne slovo
            while (inputWord.hasNext()) {
                inputWord.next(); // go to the next word
                wordCount++; // save count of existing words
            }
            inputWord.close(); // saving memory

            // show the result
            System.out.println(charCount + " characters");
            System.out.println(wordCount + " words");
            System.out.println(lineCount + " lines");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
