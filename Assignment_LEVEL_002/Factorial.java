import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("positive integer: ");
        int num= sc.nextInt();

        // Check,entered number is a positive integer
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the factorial variable
            long factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i; 
                i++; // Increment 
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}

