import java.util.*;
public class NumberChecker4{
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeonNumber(int n) {
        int square = n * n;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == n;
    }
    public static boolean isSpyNumber(int n) {
        int sumOfDigits = 0, productOfDigits = 1;
        while (n > 0) {
            int digit = n % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            n /= 10;
        }
        return sumOfDigits == productOfDigits;
    }
    public static boolean isAutomorphicNumber(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }
    public static boolean isBuzzNumber(int n) {
        return n% 7 == 0 || n % 10 == 7;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    System.out.print("Enter the numbers: ");
        int primeNumber = sc.nextInt();
        int neonNumber = sc.nextInt();
        int spyNumber = sc.nextInt();
        int automorphicNumber = sc.nextInt();
        int buzzNumber = sc.nextInt();

        System.out.println("Is " + primeNumber + " a prime number? " + isPrimeNumber(primeNumber));
        System.out.println("Is " + neonNumber + " a neon number? " + isNeonNumber(neonNumber));
        System.out.println("Is " + spyNumber + " a spy number? " + isSpyNumber(spyNumber));
        System.out.println("Is " + automorphicNumber + " an automorphic number? " + isAutomorphicNumber(automorphicNumber));
        System.out.println("Is " + buzzNumber + " a buzz number? " + isBuzzNumber(buzzNumber));
    }
}

