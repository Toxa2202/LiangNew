import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by anton.sviatov on 19.07.2019.
 */
public class Exercise04 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(123);
        list.add(34.45);
        list.add(99.009);
        list.add(234.1234);
        list.add(0.001);
        list.add(-234);
        sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void sort(ArrayList<Number> list) {
        if (list == null || list.size() == 0){
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    Number tmp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, tmp);
                }
            }
        }
    }
}
