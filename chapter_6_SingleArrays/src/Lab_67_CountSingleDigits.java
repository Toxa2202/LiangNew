public class Lab_67_CountSingleDigits {
    /** Main method */
    public static void main(String[] args) {
        int[] array = new int[10];
        repeatCount(array);
        printResult(array);
    }
    /** Generate 100 integer numbers and count repeats */
    private static void repeatCount(int[] array) {
        int count = 100;
        for (int i = 0; i < count; i++) {
            int randomNum = (int)(Math.random() * 10);
            for (int j = 0; j < array.length; j++) {
                if (randomNum == j){
                    array[j]++;
                }
            }
        }
    }
    /** Show result of repeat counts on the screen */
    private static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " repeats " + array[i]);
        }
    }
}