import java.util.*;
public class BasicCalculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose operation: 1. Add 2. Subtract 3. Multiply 4. Divide");
        int choice = sc.nextInt();
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        double ans= 0;
        switch (choice) {
            case 1:
                ans= add(num1, num2);
                break;
            case 2:
                ans= subtract(num1, num2);
                break;
            case 3:
               ans= multiply(num1, num2);
                break;
            case 4:
                ans= divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Result: " +ans);
    }
}
