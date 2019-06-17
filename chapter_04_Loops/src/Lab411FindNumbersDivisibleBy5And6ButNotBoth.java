public class Lab411FindNumbersDivisibleBy5And6ButNotBoth {
    public static void main(String[] args) {
        int number = 100;
        int count = 0;

        while (number < 200){
            if (number % 5 == 0 ^ number % 6 == 0){
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
