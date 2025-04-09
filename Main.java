import java.util.Scanner;

abstract class UnitConverter {
    public abstract double convert(double value, String fromUnit, String toUnit);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter tempConverter = new TemperatureConverter();
        MetricConverter metricConverter = new MetricConverter();

        while (true) {
            System.out.println("Choose conversion type: 1. Temperature 2. Metric 3. Exit");
            int choice = scanner.nextInt();
            if (choice == 3) break;

            if (choice == 2) {
                System.out.println("Choose metric type: 1. Length 2. Weight");
                int metricChoice = scanner.nextInt();

                if (metricChoice == 1) {
                    System.out.println("Length units: m (Meters), km (Kilometers), cm (Centimeters), mm (Millimeters)");
                } else if (metricChoice == 2) {
                    System.out.println("Weight units: kg (Kilograms), g (Grams), mg (Milligrams)");
                } else {
                    System.out.println("Invalid choice.");
                    continue;
                }
            } else {
                System.out.println("Temperature units: C (Celsius), F (Fahrenheit), K (Kelvin)");
            }

            System.out.print("Enter value to convert: ");
            double value = scanner.nextDouble();
            System.out.print("From unit: ");
            String fromUnit = scanner.next();
            System.out.print("To unit: ");
            String toUnit = scanner.next();

            double result = (choice == 1) ? tempConverter.convert(value, fromUnit, toUnit)
                    : metricConverter.convert(value, fromUnit, toUnit);

            System.out.println("Converted value: " + result);
        }
        scanner.close();
    }
}

