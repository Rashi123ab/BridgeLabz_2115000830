import java.util.*;
public class Sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a number: ");
        double userInput = sc.nextDouble();
        while (userInput != 0) {
            // Add the input to the total
            total += userInput;
            System.out.print("Enter a number (0 to stop): ");
            userInput = sc.nextDouble();
        }

        // Print the result
        System.out.println("The total sum is: " + total);
    }
}

