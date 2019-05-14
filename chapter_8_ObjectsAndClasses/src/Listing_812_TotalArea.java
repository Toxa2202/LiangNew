public class Listing_812_TotalArea {
    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        Listing_89_CircleWithPrivateDataFields[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Rectangle objects */
    public static Listing_89_CircleWithPrivateDataFields[] createCircleArray(){
        Listing_89_CircleWithPrivateDataFields[] circleArray = new Listing_89_CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Listing_89_CircleWithPrivateDataFields(Math.random() * 100);
        }

        // Return Rectangle array
        return circleArray;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(Listing_89_CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("----------------------------------------------------------------------");

        // Compute and display the result
        System.out.printf("%-30f%-15f\n", "The total area of circles is", sum(circleArray));
    }

    /** Add circle areas */
    public static double sum(Listing_89_CircleWithPrivateDataFields[] circleArray){
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
