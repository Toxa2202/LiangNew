public class Lab51_PentagonalNumbers {
    public static void main(String[] args) {
        int count = 1;

        System.out.println("The first 100 pentagonal numbers are: ");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            if (count % 10 == 0){
                System.out.println();
            }
            count++;
        }
    }
    // Method to get pentagonal number
    public static int getPentagonalNumber(int n){
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }
}
