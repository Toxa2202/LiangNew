import java.util.Scanner;

public class Lab41CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int userStop = -1;
        int total = 0, negatives = 0, positives = 0, userInput = -1;
        double average = 0;

        while (userStop != 0){
            userInput = input.nextInt();
            if (userInput > 0){
                positives++;
            } else if (userInput < 0){
                negatives++;
            } else {
                userStop = 0;
            }
            total++;
            average += userInput;
        }

        average /= (total - 1);

        if (userInput == 0 && total == 1){
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println(" The number of positives is " + positives +
                    "\n The number of negatives is " + negatives +
                    "\n The total is " + total +
                    "\n The average is " + average);
        }
    }
}
