import java.util.*;
public class Checknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        // Check,number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
