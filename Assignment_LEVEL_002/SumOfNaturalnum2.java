import java.util.*;
public class SumOfNaturalnum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Compute formula: n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            if (formulaSum == loopSum) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }

            // Print the result
            System.out.println("Sum using the formula: " + formulaSum);
            System.out.println("Sum using the for loop: " + loopSum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
