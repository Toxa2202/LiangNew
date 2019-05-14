import java.util.GregorianCalendar;

public class Lab_85_UseTheGregorianCalendarClass {
    /** Main method */
    public static void main(String[] args) {
        // Create a GregorianCalendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // Display the current year, month and day in format Day/Mth/Year
        System.out.println("Current year, month and day in format Day/Month/Year: ");
        System.out.println(calendar.get(calendar.DAY_OF_MONTH) + "/" +
                calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.YEAR));

        // Set elapsed time since January 1, 1970 to 1234567898765L
        calendar.setTimeInMillis(123456898765L);

        // Display the year, month and day
        System.out.println("Elapsed time since January 1, 1970 set to " +
                "1234567898765L in format Day/Mth/Year: ");
        System.out.println(calendar.get(calendar.DAY_OF_MONTH) + "/" +
                calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.YEAR));
    }
}
