import java.util.Scanner;

public class Lab_94_OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string followed by a character: ");
        String str = input.nextLine();
        char a = input.next().charAt(0);

        System.out.println("The number of occurrences of the  character in the string is: " + count(str, a));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
