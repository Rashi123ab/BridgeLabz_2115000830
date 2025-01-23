import java.util.*;
public class Factorialforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("positive integer: ");
        int num = sc.nextInt();

        // Check if the entered number is a positive integer
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else{
            long fact = 1;

            // Compute the factorial using a for loop
            for (int i = 1; i <= num; i++) {
                fact *= i; // Multiply factorial by i
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }
    }
}

