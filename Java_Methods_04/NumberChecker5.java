import java.util.*;
public class NumberChecker5{
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int getGreatestFactor(int n) {
        int[] factors = getFactors(n);
        return factors[factors.length - 1]; 
    }
    public static int getSumOfFactors(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int getProductOfFactors(int n) {
        int[] factors = getFactors(n);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double getProductOfCubesOfFactors(int n) {
        int[] factors = getFactors(n);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == n;
    }
    public static boolean isAbundantNumber(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > n;
    }
    public static boolean isDeficientNumber(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < n;
    }
    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == originalNumber;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res*= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 28;   
        int abundantNumber = 12;  
        int deficientNumber = 15; 
        int strongNumber = 145;
        int[] factors = getFactors(n);
        System.out.print("Factors of " + n + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest factor: " + getGreatestFactor(n));
        System.out.println("Sum of factors: " + getSumOfFactors(n));
        System.out.println("Product of factors: " + getProductOfFactors(n));
        System.out.println("Product of cubes of factors: " + getProductOfCubesOfFactors(n));
        System.out.println("Is " + n + " a perfect number? " + isPerfectNumber(n));
        System.out.println("Is " + abundantNumber + " an abundant number? " + isAbundantNumber(abundantNumber));
        System.out.println("Is " + deficientNumber + " a deficient number? " + isDeficientNumber(deficientNumber));
        System.out.println("Is " + strongNumber + " a strong number? " + isStrongNumber(strongNumber));
    }
}

