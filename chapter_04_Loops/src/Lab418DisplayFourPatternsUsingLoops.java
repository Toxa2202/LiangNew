public class Lab418DisplayFourPatternsUsingLoops {
    public static void main(String[] args) {
        int rows = 6;
        System.out.println("Pattern A");
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int i = 1; i <= rows; i++){
            for (int empty = rows - i; empty >= 1; empty--){
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = rows; i >= 1; i--){
            for (int empty = i + 1; empty <= rows; empty++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
