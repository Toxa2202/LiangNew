public class Lab415TableASCI {
    public static void main(String[] args) {
        //input parameters
        char start = '!';
        char end = '~';
        int count = 0;

        //create table name
        System.out.println("\tASCII TABLE");

        //create table
        while (start <= end){
            System.out.print(start + " ");
            count ++;
            start++;
            //if 10 symbols - jump to the next line
            if (count % 10 == 0){
                System.out.println();
            }
        }

    }
}
