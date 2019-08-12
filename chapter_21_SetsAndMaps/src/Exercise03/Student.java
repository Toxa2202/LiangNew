package Exercise03;

import java.util.Objects;

/**
 * Created by anton.sviatov on 10.08.2019.
 */
public class Student {
    private String surname;
    private String name;
    private int daysInCourse;

    public Student(String surname, String name, int daysInCourse) {
        this.surname = surname;
        this.name = name;
        this.daysInCourse = daysInCourse;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysInCourse() {
        return daysInCourse;
    }

    public void setDaysInCourse(int daysInCourse) {
        this.daysInCourse = daysInCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", daysInCourse=" + daysInCourse +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return daysInCourse == student.daysInCourse &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, daysInCourse);
    }
}
