// Abstract class Staff using Abstraction
abstract class Staff {
    private String name;
    private double baseSalary;

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method - must be implemented by all subclasses
    public abstract double calculateSalary();
}

// Doctor class (Inheritance + Encapsulation)
class Doctor extends Staff {
    private int numberOfPatients;
    private double perPatientFee;

    public Doctor(String name, double baseSalary, int numberOfPatients, double perPatientFee) {
        super(name, baseSalary);
        this.numberOfPatients = numberOfPatients;
        this.perPatientFee = perPatientFee;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public double getPerPatientFee() {
        return perPatientFee;
    }

    public void setPerPatientFee(double perPatientFee) {
        this.perPatientFee = perPatientFee;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (numberOfPatients * perPatientFee);
    }
}

// Nurse class (Inheritance + Encapsulation)
class Nurse extends Staff {
    private int extraHours;
    private double hourlyRate;

    public Nurse(String name, double baseSalary, int extraHours, double hourlyRate) {
        super(name, baseSalary);
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * hourlyRate);
    }
}

// AdminStaff class (Inheritance + Encapsulation)
class AdminStaff extends Staff {
    private double bonus;

    public AdminStaff(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Main class to test everything
public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Asha", 50000, 20, 1500);
        Nurse nurse = new Nurse("Nurse John", 30000, 10, 200);
        AdminStaff admin = new AdminStaff("Mr. Ravi", 25000, 3000);

        System.out.println(doc.getName() + "'s Salary: ₹" + doc.calculateSalary());
        System.out.println(nurse.getName() + "'s Salary: ₹" + nurse.calculateSalary());
        System.out.println(admin.getName() + "'s Salary: ₹" + admin.calculateSalary());
    }
}
