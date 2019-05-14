public class Lab423ObtainMoreAccurateResults {
    public static void main(String[] args) {
        int n = 50000;
        double resultLeftToRight = 0;
        double resultRighttoLeft = 0;

        for (double i = 1; i <= n; i++){
            resultLeftToRight += 1 / i;
        }
        System.out.println("Left to right " + resultLeftToRight);

        for (double i = n; i >= 1; i--){
            resultRighttoLeft += 1 / i;
        }
        System.out.println("Right to left " + resultRighttoLeft);

    }
}
