public class Lab_81_TheRectangleClass {
    /** Main method */
    public static void main(String[] args) {
        // Object 1
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println(" The area of the rectangle of width " + rectangle1.width + " and height " +
                rectangle1.height + " is " + rectangle1.getArea());
        System.out.println(" The perimeter of the rectangle of width " + rectangle1.width + " and height " +
                rectangle1.height + " is " + rectangle1.getPerimeter());

        // Object 2
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println(" The area of the rectangle of width " + rectangle2.width + " and height " +
                rectangle2.height + " is " + rectangle2.getArea());
        System.out.println(" The perimeter of the rectangle of width " + rectangle2.width + " and height " +
                rectangle2.height + " is " + rectangle2.getPerimeter());

    }


}

