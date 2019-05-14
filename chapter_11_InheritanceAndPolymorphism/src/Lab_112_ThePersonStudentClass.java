public class Lab_112_ThePersonStudentClass {
    public static void main(String[] args) {
        Person person = new Person("Anton", "Lviv", "102", "a@a.com");
        Student student = new Student("Andriy", "Kyiv", "103", "b@b.com", Student.FRESHMAN);
        Employee employee = new Employee("Slavik", "Odesa", "103", "c@c.com", "DonOffice", "1000", new MyDate(2013, 12, 31));
        Faculty faculty = new Faculty("Tolik", "Ternopil", "105", "d@d.com", "TernopilOffice", "2000", new MyDate(), 123, "director");
        Staff staff = new Staff("Nadia", "Poltava", "106", "e@e.com", "LugCom", "3000", new MyDate(2013, 11, 11), "staFF");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person " + getName();
    }
}

class Student extends Person{
    private int classStatus;
    static final int FRESHMAN = 0;
    static final int SOPHOMORE = 1;
    static final int JUNIOR = 2;
    static final int SENIOR = 3;

    public Student(String name, String address, String phoneNumber, String email, int classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student " + super.getName();
    }
}

class Employee extends Person {
    private String office;
    private String salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, String salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee " + super.getName();
    }
}

class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, String salary, MyDate dateHired,
                   int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty " + super.getName();
    }
}

class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, String salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff " + super.getName();
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        long totalSeconds = elapsedTime / 100;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;
        totalDays++;

        int year = 1970;
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year++);
        }

        int month = 1;
        while (totalDays > getNumberOfDaysInMonth(year, month)) {
            totalDays -= getNumberOfDaysInMonth(year, month++);
        }
        this.year = year;
        this.month = month - 1;
        this.day = (int)(totalDays);
    }

    private static int getNumberOfDaysInMonth(int year,  int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                        || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}