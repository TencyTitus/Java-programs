public class Employee {
    String name;
    double basicPay;
    double da;  

    void calculateDA() {
        da = 0.10 * basicPay;
    }

    void calculateSalary() {
        calculateDA();

        double totalSalary = basicPay + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "John";
        emp.basicPay = 50000;
        emp.calculateSalary();
    }
}
