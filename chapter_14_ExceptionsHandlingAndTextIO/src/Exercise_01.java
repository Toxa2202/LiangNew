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
        try {
            switch (tokens[1].charAt(0)) {
                case '+': result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
                    break;
                case '-': result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
                    break;
                case '*': result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
                    break;
                case '/': result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        try {
            System.out.println(tokens[0] + ' ' + tokens[1] + ' ' + tokens[2] + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
