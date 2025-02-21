import java.util.Scanner;
public class NestedTryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num= {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            try {
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();
                int result = num[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("Code Executed");
        }
    }
}
