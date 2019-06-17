public class Lab412FindTheSmallestN {
    public static void main(String[] args) {
        int n = 1000;
        int smallestN = 0;

        while ((n * n) > 12000){
            smallestN = n;
            n--;
        }
        System.out.println(smallestN);
    }
}
