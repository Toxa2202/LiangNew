import java.util.Scanner;

public class Lab_61_AssignGrades {
    /** Main method */
    public static void main(String[] args) {
        // Ask user to input scores
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter " + numberOfStudents + " scores: ");
        // Get all scores in loop
        int[] studentScores = new int[numberOfStudents];
        for (int i = 0; i < studentScores.length; i++) {
            int score = input.nextInt();
            studentScores[i] = score;
        }
        // Sending user scores to method for print best scores on the screen
        bestScoresTable(bestScore(studentScores), studentScores);
    }

    /** Method for finding best score */
    public static int bestScore(int[] studentScores){
        int bestScore = 0;
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] > bestScore){
                bestScore = studentScores[i];
            }
        }
        return bestScore;
    }

    /** Method to print all scores in right table on the screen */
    public static void bestScoresTable(int bestScore, int[] studentScores){
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] >= bestScore - 10){
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is A");
            } else if (studentScores[i] >= bestScore - 20){
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is B");
            } else if (studentScores[i] >= bestScore - 30){
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is C");
            } else if (studentScores[i] >= bestScore - 40){
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is F");
            }
        }
    }
}