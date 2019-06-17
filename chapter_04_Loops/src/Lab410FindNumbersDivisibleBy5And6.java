public class Lab410FindNumbersDivisibleBy5And6 {
    public static void main(String[] args) {
        int  number = 100, count = 0;
        while (number < 1000){
            if (number % 5 == 0 && number % 6 == 0){
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0){
                    System.out.println();
                }
            }
            number++;
        }
    }
}
