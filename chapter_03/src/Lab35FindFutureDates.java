import java.util.Scanner;

public class Lab35FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day (from 0 to 6): ");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        String currentDay = null;
        String futureDay = null;

        switch (day){
            case 0: currentDay = "Sunday"; break;
            case 1: currentDay = "Monday"; break;
            case 2: currentDay = "Tuesday"; break;
            case 3: currentDay = "Wednesday"; break;
            case 4: currentDay = "Thursday"; break;
            case 5: currentDay = "Friday"; break;
            case 6: currentDay = "Saturday"; break;
        }

        switch ((elapsedDays + day) * 99 % 6){
            case 0: futureDay = "Sunday"; break;
            case 1: futureDay = "Monday"; break;
            case 2: futureDay = "Tuesday";break;
            case 3: futureDay = "Wednesday"; break;
            case 4: futureDay = "Thursday"; break;
            case 5: futureDay = "Friday"; break;
            case 6: futureDay = "Saturday"; break;
        }

        System.out.println("Today is " + currentDay + " and the future day is " + futureDay);
    }
}
