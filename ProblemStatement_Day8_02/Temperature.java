import java.util.*;
public class Temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Convert Fahrenheit to Celsius");
        System.out.println("2.Convert Celsius to Fahrenheit");
        System.out.print("Choose an option above: ");

        int options = sc.nextInt();

        switch (options) {
            case 1:
                double fahrenheit =Input("Enter temperature in Fahrenheit: ");
                double celsius = convertFahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
                break;
            case 2:
                celsius =Input("Enter temperature in Celsius: ");
                fahrenheit = convertCelsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
                break;
            default:
                System.out.println("Invalid choice. Please select options");
        }
    }

    private static double Input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

