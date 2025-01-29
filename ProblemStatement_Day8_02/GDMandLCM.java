import java.util.*;
public class GDMandLCM {
    public static void main(String[] args) {
        int num1 = Input("Enter the first number: ");
        int num2 = Input("Enter the second number: ");

        int gcd =GCD(num1, num2);
        int lcm =LCM(num1, num2, gcd);

        displayResults(num1, num2, gcd, lcm);
    }

    private static int Input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    private static int LCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    private static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}

