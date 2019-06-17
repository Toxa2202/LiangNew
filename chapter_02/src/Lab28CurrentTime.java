import java.util.Scanner;

public class Lab28CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your time zone: ");
        int timezone = input.nextInt();

        long seconds = System.currentTimeMillis() / 1000;
        long currentSeconds = seconds % 60;

        long minutes = (int)seconds / 60;
        long currentMinutes = minutes % 60;

        long hours = minutes / 24;
        long currentHours = hours % 24 + timezone;
        System.out.println("The current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
