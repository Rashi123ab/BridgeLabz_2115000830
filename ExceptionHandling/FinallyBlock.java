import java.util.Scanner;
public class FinallyBlock{
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
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
