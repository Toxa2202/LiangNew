public class Lab512_DisplayCharacters {
    /** Main method */
    public static void main(String[] args) {
        int numerPerLine = 10;
        char startChar = '1';
        char endChar = 'Z';
        printChars(startChar, endChar, numerPerLine);
    }

    /** Method that prints Characters */
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 1;
        for (char i = ch1; i <= ch2; i++) {
            System.out.print(i + " ");
            if (count % numberPerLine == 0){
                System.out.println();
            }
            count++;
        }
    }
}
