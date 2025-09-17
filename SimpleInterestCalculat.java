import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();
        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);
        sc.close();
    }
}
