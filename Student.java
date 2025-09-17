public class Student {
    String name;
    int mark;

    public Student() {
        this.name = "unknown";
        this.mark = 0;
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String calculateGrade() {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 75) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else if (mark >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayResult() {
        System.out.println("Name: " + this.name);
        System.out.println("Mark: " + this.mark);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayResult();
        System.out.println();

        Student s2 = new Student("Alice", 82);
        s2.displayResult();
        System.out.println();

        Student s3 = new Student("Bob", 45);
        s3.displayResult();
    }
}
