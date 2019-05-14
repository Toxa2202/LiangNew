public class Lab_101_TheTimeClass {
    // Main class
    public static void main(String[] args) {
        System.out.println(new Time());
        System.out.println(new Time(555550000));
        System.out.println(new Time(12, 1, 2));
    }
}

class  Time {
    // Private data fields
    private int hour, minute, second;

    // Default constructor
    public Time() {
        setTime(System.currentTimeMillis());
    }
    // Constructor with some time parameter
    public Time(long milliseconds) {
        setTime(milliseconds);
    }
    // Constructor with input user data
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    // Method to set input time in hours, minutes and seconds
    public void setTime(long elapsedTIme) {
        long totalSeconds = elapsedTIme / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 60);
    }
    // Method convert data to String
    public String toString() {
        // Formatted string like NN:NN:NN
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
