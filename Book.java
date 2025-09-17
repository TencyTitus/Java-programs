public class Book{
	String title;
	String author;
	double price;

public static void main(String[] args){
	Book MyBook = new Book();
	MyBook.title = "Java Book";
	MyBook.author = "john";
	MyBook.price = 120;

	System.out.println("Title:"+MyBook.title);
	System.out.println("Author:"+MyBook.author);
	System.out.println("Price:"+MyBook.price);
}
}