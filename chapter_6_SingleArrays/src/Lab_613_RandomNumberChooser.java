public class Lab_613_RandomNumberChooser {
    public static void main(String[] args) {
        /** Main method */
        int[] excludedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Output result on the screen
        System.out.println("Random number from 1 to 54 is --> " + getRandom(excludedNumbers));
    }

    /** Method get random number from 1 to 54 excluding entered in main method numbers */
    public static int getRandom(int ... numbers) {
        int randomNumber = 1 + (int)(Math.random() * 54);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomNumber){
                randomNumber = 1 + (int)(Math.random() * 54);
                i = -1;
            }
        }
        return randomNumber;
    }
}
