public class Book1 {
    String title;
    String author;
    double price;

    public Book1() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1();
        System.out.println("Default Book:");
        book1.displayDetails();
        System.out.println();

        Book1 book2 = new Book1("Java Programming", "James Gosling", 499.50);
        System.out.println("Custom Book:");
        book2.displayDetails();
    }
}
