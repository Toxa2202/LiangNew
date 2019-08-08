import java.util.HashSet;
import java.util.Set;

/**
 * Created by anton.sviatov on 08.08.2019.
 */
public class Exercise01 {
    public static void main(String[] args) {
        Set<String> textBooks1 = new HashSet<>();
        textBooks1.add("Chemistry");
        textBooks1.add("Mathematics");
        textBooks1.add("Biology");
        textBooks1.add("English");

        Set<String> textBooks2 = new HashSet<>();
        textBooks2.add("Biology");
        textBooks2.add("English");
        textBooks2.add("Geography");
        textBooks2.add("Physics");

        Set<String> copySet1 = new HashSet<>(textBooks1);
        Set<String> copySet2 = new HashSet<>(textBooks2);

        copySet1.removeAll(textBooks2);
        System.out.println("Original elements in first stack are: " + copySet1);

        copySet2.removeAll(textBooks1);
        System.out.println("Original elements in second stack are: " + copySet2);

        textBooks1.retainAll(textBooks2);
        System.out.println("After retaining common elements in both stack are: "
                + textBooks1);

    }
}
