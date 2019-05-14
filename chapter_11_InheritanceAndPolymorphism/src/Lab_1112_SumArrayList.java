import java.util.ArrayList;
import java.util.Scanner;

public class Lab_1112_SumArrayList {
    public static void main(String[] args) {
        ArrayList<Double> userInput = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int listSize = 5;
        for (int i = 0; i < listSize; i++) {
            userInput.add(input.nextDouble());
        }
        System.out.printf("The sum is of your numbers is: %.10f", sum(userInput));
    }

    public static double sum(ArrayList<Double> list) {
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }
}
