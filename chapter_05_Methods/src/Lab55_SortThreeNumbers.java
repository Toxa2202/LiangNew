import java.util.Scanner;

public class Lab55_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three double numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double first, second, third;
        if (num1 > num2 && num1 > num3){
            first = num1;
            if (num2 > num3){
                second = num2;
                third = num3;
            } else {
                second = num3;
                third = num2;
            }
        } else if (num2 > num1 && num2 > num3){
            first = num2;
            if (num1 > num3){
                second = num1;
                third = num3;
            } else {
                second = num3;
                third = num1;
            }
        } else {
            first = num3;
            if (num1 > num2){
                second = num1;
                third = num2;
            } else {
                second = num2;
                third = num1;
            }
        }
        System.out.println(third + " --> " + second + " --> " + first);
    }
}
