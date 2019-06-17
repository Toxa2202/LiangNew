import java.util.Scanner;

public class Lab27FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        if (minutes >= 1440) {
            int days = minutes / 60 / 24;
            int years = days / 365;
            System.out.println(minutes + " is approximately " + years + " years and " + (days - (years * 365)) + " days.");
        } else {
            System.out.println("You entered less than one day.");
        }
    }
}
