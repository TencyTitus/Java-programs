public class Student0{
	String name;
	int mark;


	public void displayDetails(){
	System.out.println("Name:" +name);
	System.out.println("Mark:" +mark);
}

public static void main(String[] args){
	Student0 s1 = new Student0();
	s1.name = "John";
	s1.mark = 21;

	s1.displayDetails();

}
}