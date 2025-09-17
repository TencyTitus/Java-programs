public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimensions(10, 5);           
        box1.displayDimensions();            
        System.out.println("Area: " + box1.calculateArea());
        System.out.println("Is square? " + box1.isSquare());
        System.out.println();

        
        Box box2 = new Box(6, 6);
        box2.displayDimensions();            
        System.out.println("Area: " + box2.calculateArea());
        System.out.println("Is square? " + box2.isSquare());
    }
}


class Box {
    
    private int width;
    private int height;

    
    public Box() {
        width = 0;
        height = 0;
        System.out.println("Default constructor called. Dimensions set to 0.");
    }


    public Box(int w, int h) {
        width = w;
        height = h;
        System.out.println("Parameterized constructor called.");
    }

        public void setDimensions(int w, int h) {
        width = w;
        height = h;
    }

    
    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }


    public int calculateArea() {
        return width * height;
    }

   
    public boolean isSquare() {
        return width == height;
    }
}
