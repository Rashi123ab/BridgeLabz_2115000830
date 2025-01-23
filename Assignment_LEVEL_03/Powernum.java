import java.util.*;
public class Powernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base number: ");
        int num= sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();

        int result = 1;

        // power using a loop
        for (int i = 1; i <= p; i++) {
            result *= num;  // Multiply result by the base number
        }
        System.out.println(num + " raised to the power of " + p + " is: " + result);
    }
}
