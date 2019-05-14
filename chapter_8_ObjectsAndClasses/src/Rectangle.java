public class Rectangle {
    double width;
    double height;

    // Default constructor
    Rectangle(){
        width = 1;
        height = 1;
    }

    // Overloaded constructor
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    // Method to get area of rectangle
    double getArea(){
        return width * height;
    }
    // Method to get perimeter of rectangle
    double getPerimeter(){
        return (width + height) * 2;
    }

    // Setter width
    void setWidth(double newWidth){
        width = newWidth;
    }
    // Setter height
    void setHeight(double newHeight){
        height = newHeight;
    }
}
