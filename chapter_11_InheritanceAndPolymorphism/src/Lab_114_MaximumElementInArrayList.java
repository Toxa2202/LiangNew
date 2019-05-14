import java.util.ArrayList;
import java.util.Scanner;

public class Lab_114_MaximumElementInArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some integers. End with '0'.");
        ArrayList<Integer> userInput = new ArrayList<>();
        int checker = input.nextInt();
        while (checker != 0) {
            userInput.add(checker);
            checker = input.nextInt();
        }
        System.out.println("Maximum value is: " + max(userInput));
    }

    public static Integer max(ArrayList<Integer> list) {
        int maxValue = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (maxValue < list.get(i)) {
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }
}

