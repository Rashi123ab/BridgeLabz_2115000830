import java.util.*;
public class OddEvenNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check,entered number is a natural number
        if (num <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Start from 1 to the entered number using a for loop
            for (int i = 1; i <= num; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }
    }
}
