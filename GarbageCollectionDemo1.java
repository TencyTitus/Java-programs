// File: GarbageCollectionDemo1.java
public class GarbageCollectionDemo1 {
    String name;

    GarbageCollectionDemo1(String name) {
        this.name = name;
    }

    // finalize() is called by GC before object is destroyed (deprecated in modern Java)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is deleting object: " + name);
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionDemo1 obj1 = new GarbageCollectionDemo1("Object1");
        GarbageCollectionDemo1 obj2 = new GarbageCollectionDemo1("Object2");

        // obj1 is now eligible for GC because we lose its reference
        obj1 = null;

        // obj2 is eligible for GC because we reassign its reference
        obj2 = new GarbageCollectionDemo1("Object3");

        // Request JVM to run Garbage Collector (may or may not run immediately)
        System.gc();

        System.out.println("End of main method");
    }
}
