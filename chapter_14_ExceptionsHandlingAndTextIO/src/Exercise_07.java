import java.util.Scanner;

/**
 * Created by anton.sviatov on 18.06.2019.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a binary string: ");
        String binaryStr = input.next();

        System.out.println("The decimal value for the binary string " +
                binaryStr + " is " + binaryToDecimal(binaryStr));
    }

    public static int binaryToDecimal(String binaryStr) {
        int result = 0;
        int twoPow = 1;
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                result += twoPow;
            } else if (binaryStr.charAt(i) != '0') {
                throw new NumberFormatException();
            }
            twoPow *= 2;
        }
        return result;
    }
}