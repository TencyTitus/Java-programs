class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting: reference is Animal, object is Dog
        Animal a2 = new Cat();
        a1.sound(); // Output: Woof
        a2.sound(); // Output: Meow
    }
}
