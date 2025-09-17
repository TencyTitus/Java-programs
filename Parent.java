class Parent {
    protected int number = 10;

    protected void showNumber() {
        System.out.println("Number: " + number);
    }
}

class Child extends Parent {
    void display() {
        showNumber();  // Access protected method
        System.out.println("Accessing protected data: " + number);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

