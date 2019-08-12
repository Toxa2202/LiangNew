package Exercise03;

import java.util.*;

/**
 * Created by anton.sviatov on 10.08.2019.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Pupkin", "Steven", 12));
        studentSet.add(new Student("Pupkina", "Eva", 9));
        studentSet.add(new Student("Marley", "Steven", 1));
        studentSet.add(new Student("Trump", "Donald", 5));
        studentSet.add(new Student("Bobul", "Ivo", 1));
        studentSet.add(new Student("Chan", "Eva", 7));

        List<Student> list = new ArrayList<Student>(studentSet);
        list.sort(Comparator.comparing(o -> o.getName()));

        for (Student student: list) {
            if (student.getDaysInCourse() > 1) {
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }

        System.out.println("-----------------------");

        Set<String> studentNames = new HashSet<>();
        for (Student name: studentSet) {
            studentNames.add(name.getName());
        }
        System.out.println(studentNames);

        // cant show duplicates in list

        int[] count = new int[list.size()];
        for (Student student: list) {
            for (int i = 0; i < list.size(); i++) {
                if (student.getName().equals(list.get(i).getName())) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (count[i] > 1) {
                System.out.println(list.get(count[i]).getName());
            }
        }
    }
}
