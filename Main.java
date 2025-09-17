public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(2.0, 4.0); // b1 refers to a Box object
        Box b2 = b1;                // b2 also refers to the same object

        b1.display();
        b2.display();

        b1 = new Box(5.0, 10.0);    // b1 now refers to a new object
        b1.display();
        b2.display();              // Still refers to the old object
    }
}
