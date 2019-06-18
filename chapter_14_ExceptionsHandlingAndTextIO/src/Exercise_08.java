import java.util.Scanner;

/**
 * Created by anton.sviatov on 18.06.2019.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for the hex number " + hex +
                " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '7') {
            return ch - '0';
        } else {
            throw new HexFormatException(ch);
        }
    }
}

class HexFormatException extends NumberFormatException {
    public HexFormatException (char ch) {
        super(ch + " is not valid hex value");
    }
}