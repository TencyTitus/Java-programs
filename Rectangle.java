public class Rectangle{
	double length;
	double breadth;


	void setDimensions(int l, int b){
		length = l;
		breadth = b;
	}

	double getPerimeter(){
		return 2 * (length + breadth);
	}

public static void main(String[] args){
	Rectangle rec = new Rectangle();
	rec.setDimensions(10,5);

	double perimeter = rec.getPerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
}
}