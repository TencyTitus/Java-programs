import java.util.Scanner;

public class StudentDetailsInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollNo = 0;
        String division = "";
        String address = "";
        String name = "";

        while (true) {
            try {
                // Roll Number
                System.out.print("Enter Roll Number (int): ");
                rollNo = Integer.parseInt(scanner.nextLine());

                // Division
                System.out.print("Enter Division (A/B/C...): ");
                division = scanner.nextLine();
                if (division.isEmpty() || !division.matches("[A-Za-z]")) {
                    throw new IllegalArgumentException("Division must be a single alphabet character (A/B/C...)");
                }

                // Address
                System.out.print("Enter Address: ");
                address = scanner.nextLine();
                if (address.isEmpty()) {
                    throw new IllegalArgumentException("Address cannot be empty.");
                }

                // Name
                System.out.print("Enter Name: ");
                name = scanner.nextLine();
                if (name.isEmpty() || !name.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Name must contain only letters and spaces.");
                }

                // All valid, exit the loop
                break;

            } catch (NumberFormatException e) {
                System.out.println("Roll Number must be an integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

            System.out.println("Please re-enter all details correctly.\n");
        }

        // Output
        System.out.println("\n Student Details Entered Successfully:");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Division    : " + division);
        System.out.println("Address     : " + address);
        System.out.println("Name        : " + name);

        scanner.close();
    }
}
