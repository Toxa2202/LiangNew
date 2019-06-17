public class Lab510_UseTheIsPrimeMethod {
    /** Main method */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println("In range from 1 to 10000 we have \n" + count + "\nprime numbers.");
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // if true, number is not prime
                return false; // Number is not prime
            }
        }
        return true; // Number is prime
    }
}
