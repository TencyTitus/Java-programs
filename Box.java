public class Box {
    private double width;
    private double height;

    // Default constructor
    public Box() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    public Box(double w, double h) {
        width = w;
        height = h;
    }

public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
public class Main {

public static void main(String[] args) {

Box b1 = new Box();    // Uses default constructor
        
Box b2 = new Box(3.4, 5.2);//parameterized constructor

        b1.display();
        b2.display();
    }
}
