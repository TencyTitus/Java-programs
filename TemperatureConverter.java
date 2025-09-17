import java.util.Scanner;

public class TemperatureConverter {
    double celsius;

    void setTemperature(double c) {
        celsius = c;
    }

    double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter temp = new TemperatureConverter();

        System.out.print("Enter temperature in Celsius: ");
        double inputTemp = scanner.nextDouble();

        temp.setTemperature(inputTemp);
        double fahrenheit = temp.toFahrenheit();

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
