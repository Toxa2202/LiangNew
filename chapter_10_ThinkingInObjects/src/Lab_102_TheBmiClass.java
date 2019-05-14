public class Lab_102_TheBmiClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yong", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
            + bmi1.getBMI()  + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI()  + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("Stiven Pupkin", 21, 210, 5, 10);
        System.out.println("The BMI for " + bmi3.getName() + " is "
                + bmi3.getBMI()  + " " + bmi3.getStatus());
    }
}

class BMI {
    // primitives
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    private double feet;
    private double inches;
    // Constants
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH =  0.0254;
    // Constructor
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    //Constructor
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        height = feet * 12 + inches;
    }
    // Constructor
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    //Method calculate BMI
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
    // Method output the result in String consider to BMI
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "UnderWeight";
        } else  if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "OverWeight";
        } else {
            return "Obese";
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }
}
