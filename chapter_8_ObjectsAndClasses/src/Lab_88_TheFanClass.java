public class Lab_88_TheFanClass {
    public static void main(String[] args) {
        Fan first = new Fan();
        first.setSpeed(first.FAST);
        first.setRadius(10);
        first.setColor("yellow");
        first.setOn(true);

        Fan second = new Fan();
        second.setSpeed(second.MEDIUM);
        second.setRadius(5);
        second.setColor("blue");
        second.setOn(false);

        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // No args constructor
    Fan(){

    }

    public String toString(){
        if (isOn()){
            return "Speed is " + speed + ", color is " + color +
                    ", radius is " + radius;
        } else {
            return "Color is " + color + ", radius is " + radius +
                    ". Fan is OFF.";
        }
    }
}
