import java.util.Scanner;

public class Lab49TwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String bestName = " ";
        String secondBestName = " ";
        int bestStudentScore = 0, secondBestStudentScore = 0, count = 0;

        while (count < numberOfStudents){
            System.out.println("Enter student's name:  ");
            String studentName = input.next();
            System.out.println("Enter student's score:  ");
            int studentScore = input.nextInt();

            if (studentScore > bestStudentScore){
                secondBestStudentScore = bestStudentScore;
                secondBestName = bestName;
                bestStudentScore = studentScore;
                bestName = studentName;
            }
            count++;

        }

        if (count > 0 && count != numberOfStudents){
            System.out.println("You mistake. Try again!");
        }

        System.out.println("The student with the highest score " + bestStudentScore + " is " + bestName +
                " \nThe student with the second highest score " + secondBestStudentScore + " is " + secondBestName);
    }
}
