// Demonstration of Encapsulation
class Employeee {
    private String name;        // private = hidden from outside
    private double salary;

    // Constructor to initialize
    public Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;    }

    // Public getter method for name
    public String getName() {
        return name;    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;    }

    // Public getter for salary
    public double getSalary() {
        return salary;    }

    // Public setter for salary with simple validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;        }    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employeee emp = new Employeee("Asha", 35000);

        // Accessing data via getters and setters
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(40000); // Valid
        emp.setName("Anu");

        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
