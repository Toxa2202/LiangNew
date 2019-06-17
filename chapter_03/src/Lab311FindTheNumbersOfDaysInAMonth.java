import java.util.Scanner;

public class Lab311FindTheNumbersOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month){
            case 1:
                System.out.println("January " + year + " has 31 day."); break;
            case 2:
                if (year % 4 == 0 && month == 2) {
                    System.out.println("February " + year + " has 29 days.");
                } else {
                    System.out.println("February " + year + " has 28 day.");
                }
                 break;
            case 3:
                System.out.println("March " + year + " has 31 day."); break;
            case 4:
                System.out.println("April " + year + " has 30 day."); break;
            case 5:
                System.out.println("May " + year + " has 31 day."); break;
            case 6:
                System.out.println("June " + year + " has 31 day."); break;
            case 7:
                System.out.println("July " + year + " has 31 day."); break;
            case 8:
                System.out.println("August " + year + " has 31 day."); break;
            case 9:
                System.out.println("September " + year + " has 30 day."); break;
            case 10:
                System.out.println("October " + year + " has 31 day."); break;
            case 11:
                System.out.println("November " + year + " has 30 day."); break;
            case 12:
                System.out.println("December " + year + " has 31 day."); break;
        }
    }
}
