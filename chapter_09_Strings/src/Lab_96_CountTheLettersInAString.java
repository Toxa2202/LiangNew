import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Lab_96_CountTheLettersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = input.nextLine();
        System.out.println("Te number of letters from the string: '" + userInput + "'n is " + countLetters(userInput));
    }

    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
