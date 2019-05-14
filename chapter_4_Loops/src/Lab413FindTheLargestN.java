public class Lab413FindTheLargestN {
    public static void main(String[] args) {
        int n = 0;
        int largestN = 0;

        while (Math.pow(n, 3) < 12000){
            largestN = n;
            n++;
        }
        System.out.println(largestN);
    }
}
