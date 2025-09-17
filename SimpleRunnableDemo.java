class CountRunnable implements Runnable {
    private static int count = 0;

    // Synchronized method to increment and get count
    private static synchronized int getNextCount() {
        return ++count;
    }

    public void run() {
        int currentCount = getNextCount();
        System.out.println("Count: " + currentCount);
    }
}

public class SimpleRunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CountRunnable());
        Thread t2 = new Thread(new CountRunnable());
        Thread t3 = new Thread(new CountRunnable());

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main ends.");
    }
}