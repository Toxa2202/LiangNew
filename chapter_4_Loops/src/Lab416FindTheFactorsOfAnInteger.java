import java.util.Scanner;

public class Lab416FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = input.nextInt();
        //minimal factor
        int index = 2;
        //finding and display all factors in increasing order
        while (userInput / index != 1){
            //test as a factor of number
            if (userInput % index == 0){
                System.out.print(index + ", ");
                userInput /= index;
            } else {
                index++;
            }
        }
        System.out.println(userInput + ". ");
    }
}
