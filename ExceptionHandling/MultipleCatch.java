import java.util.Scanner;
public class MultipleCatch{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer[] num = {10, 20, 30, 40, 50}; // Example array
        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + num[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("Code Executed");
         }
    }
}
