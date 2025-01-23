import java.util.*;
public class Sumofnum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            // User for input
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = sc.nextDouble();

            // Check,input is 0 or a negative number to break the loop
            if (userInput <= 0) {
                break;
            }
            total += userInput;
        }//display result
        System.out.println("The total sum is: " + total);
    }
}
