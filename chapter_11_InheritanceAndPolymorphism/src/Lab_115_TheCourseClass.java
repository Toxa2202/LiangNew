import java.util.ArrayList;

public class Lab_115_TheCourseClass {
    public static void main(String[] args) {
        // Create two courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jonatan");
        course2.addStudent("Steve Smith");

        int sizeOfCourse = 25;
        for (int i = 0; i < sizeOfCourse; i++) {
            course1.addStudent("Student n" + i);
        }

        course1.dropStudent("Student n5");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        // List of students on the screen
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        course2.clear(); // Delete list of course2
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
    }
}

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    // Na vhid v constructor padaje courseName
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }

    // Actions with ArrayList. All methods return from ArrayList Class

    public void addStudent(String student) {
        students.add(student);
    }

    // Get list of students in String array format
    public String[] getStudents() {
        return students.toArray(new String[0]);
    }


    public int getNumberOfStudents() {
        return students.size();
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }
}
