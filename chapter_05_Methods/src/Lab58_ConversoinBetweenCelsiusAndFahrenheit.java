public class Lab58_ConversoinBetweenCelsiusAndFahrenheit {
    /** Main method */
    public static void main(String[] args) {
        double startCelsius = 40, endCelsius = 31;
        double startFahrenheit = 120, endFahrenheit = 30;

        System.out.println("Celsius\t\t\tFahrenheit\t\t|\t\t\tFahrenheit\t\tCelsius");
        System.out.println("--------------------------------------------------------------------");
        for (double i = startCelsius, j = startFahrenheit; i >= endCelsius && j >= endFahrenheit; i--, j-=10) {
            //Create a table with converted parameters with PRINTF
            System.out.printf("%.1f\t\t\t%.1f\t\t\t|\t\t\t%.1f\t\t\t%.2f%n", i, celsiusToFahrenheit(i), j, fahrenheitToCelsius(j));
        }
    }

    /** Convert from Celsius to Fahrenheit*/
    public static double celsiusToFahrenheit(double celsuis){
        return (9.0 / 5) * celsuis + 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
