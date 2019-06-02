/**
 * Created by anton.sviatov on 02.06.2019.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Java Calculator \"operand1 operator operand2\"");
            System.exit(1);
        }

        int result = 0;
        String[] tokens = args[0].split(" ");
        int x;
        int y;

        try {
            x = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(tokens[0]);
        }

        try {
            y = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(tokens[2]);
        }

        switch (tokens[1].charAt(0)) {
            case '+': result = x + y;
                break;
            case '-': result = x - y;
                break;
            case '*': result = x * y;
                break;
            case '/': result = x / y;
        }

        try {
            System.out.println(tokens[0] + ' ' + tokens[1] + ' ' + tokens[2] + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
