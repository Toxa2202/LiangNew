import java.util.Date;

public class Lab_83_UseTheDataClass {
    /** Main method */
    public static void main(String[] args) {
        // Create an object
        Date date = new Date();

        // Give all input values to Array
        long[] userInput = new long[]{10_000l, 100_000l, 1_000_000l, 10_000_000l,
                100_000_000l, 1_000_000_000l, 10_000_000_000l, 100_000_000_000l};

        // Send one by one every number to date class and return result to prompt
        for (int i = 0; i < userInput.length; i++) {
            date.setTime(userInput[i]);
            System.out.println(date.toString());
        }
    }
}
