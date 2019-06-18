/**
 * Created by anton.sviatov on 18.06.2019.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        try {
            int[] array = new int[1000000000];
        } catch (OutOfMemoryError ex) {
            System.out.println("Out of memory error");
        }
    }
}
