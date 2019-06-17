public class Lab56_DisplayPattern {
    // Main method. Same method as a Lab418
    public static void main(String[] args) {
        int number = 9;
        // Go  to another  method without returning
        displayPattern(number);
    }

    public static void displayPattern(int n){
        // Creating a reverse  pyramid
        for (int i = 1; i <= n; i++) {
            for (int empty = n - i; empty >= 1; empty--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
