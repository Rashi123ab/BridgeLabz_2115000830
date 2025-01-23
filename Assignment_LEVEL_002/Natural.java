import java.util.*;
public class Natural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        // Check,number is a natural number
        if (num >= 0) {
            // Calculate the sum 
            int sum = num* (num+ 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        }
    else {
            System.out.println("The number " + num+ " is not a natural number.");
        }
    }
}
