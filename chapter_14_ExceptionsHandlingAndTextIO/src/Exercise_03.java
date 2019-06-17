import java.util.Scanner;

/**
 * Created by anton.sviatov on 17.06.2019.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        int[] randomInt = new int[100];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * 100);
        }

        System.out.println("Enter the index from '0' to '99': ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        try {
            if (userInput < 0 && userInput > 99) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println("Your number in position " + userInput +
                        " is " + randomInt[userInput]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out Of Bounds!");
        }
    }
}
