// Base class representing a general Shape
class Shape {
    String color;

    // Method to set color
    void setColor(String color) {
        this.color = color;
    }

    // Method to display the color
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Derived class representing a Circle (inherits from Shape)
class Circle extends Shape {
    double radius;

    // Method to set the radius
    void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class representing a Rectangle (inherits from Shape)
class Rectangle extends Shape {
    double length;
    double breadth;

    // Method to set dimensions
    void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    double calculateArea() {
        return length * breadth;
    }
}

// Main class to test inheritance
public class SmartShapesTest {
    public static void main(String[] args) {
        // Create and use a Circle object
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(5.0);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        System.out.println(); // Line break

        // Create and use a Rectangle object
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setDimensions(10.0, 12.0);
        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
