import java.io.*;
import java.util.*;
public class UncheckedException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st number: ");
            int numerator = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            System.out.println("Code executed successfully.");
        }
    }
}
