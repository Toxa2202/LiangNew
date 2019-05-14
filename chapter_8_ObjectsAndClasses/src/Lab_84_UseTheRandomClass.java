import java.util.Random;

public class Lab_84_UseTheRandomClass {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        final int REPEATS = 50;
        for (int i = 1; i <= REPEATS; i++) {
            System.out.print(rand.nextInt(100) + "\t");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
