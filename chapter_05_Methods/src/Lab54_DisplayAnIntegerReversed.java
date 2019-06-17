import java.util.Scanner;

public class Lab54_DisplayAnIntegerReversed {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some integer: ");
        int userInput = input.nextInt();
        //Set userInput to another method
        reverse(userInput);
    }

    /** Reversing method. Type VOID does not return any value*/
    public static void reverse(int number){
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >=  0; i--) {
            reverse = reverse + n.charAt(i); // Перебираємо значення через charAt()
        }
        System.out.println("Reverse number of " + number + " is " + reverse);
    }
}
