import java.util.ArrayList;
import java.util.Collections;

public class Lab_117_ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int listSize = 10;
        for (int i = 0; i < listSize; i++) {
            integers.add(i);
        }
        shuffle(integers);

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
