import java.util.Scanner;

public class Lab_64_AnalizeScores {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Enter some scores. " +
                "Maximum number of scores is 100. " +
                "To stop enter negative number.");
        int[] scores = new int[100];
        fill(scores);
        int averageScore  = avarage(scores);
        // Finding aboveTheAverage and belowTheAverage
        int aboveScores = 0, belovScores = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0){
                if (scores[i] >= averageScore){
                    aboveScores++;
                } else {
                    belovScores++;
                }
            }
        }
        System.out.println("We have " + aboveScores + " above the average " + averageScore);
        System.out.println("And " + belovScores + " below the average " + averageScore);
    }

    /** Method to find the average number */
    private static int avarage(int[] scores) {
        int average = 0;
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            // Count only positive numbers
            if (scores[i] > 0){
                count++;
                average += scores[i];
            }
        }
        return average / count;
    }

    /** Method to fill the array from user input */
    private static void fill(int[] scores) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] < 0){
                break;
            }
        }
    }
}
