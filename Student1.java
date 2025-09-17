public class Student1{
	String name;
	int marks;

	public void displayDetails(){
		System.out.println("Name:" +name);
		System.out.println("Marks:" +marks);
	}

public static void main(String[] args){
	Student1 s1 = new Student1();
	
	s1.name = "Alice";
	s1.marks = 80;
	
	s1.displayDetails();
	}
}