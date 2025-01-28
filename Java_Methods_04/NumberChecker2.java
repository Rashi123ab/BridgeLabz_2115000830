import java.util.*;
public class NumberChecker2{
    public static int countDigits(int n){
            return String.valueOf(n).length();
    }
	public static int[] getDigitsArray(int n) {
        String numberStr = String.valueOf(n);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int n) {
        int[] digits = getDigitsArray(n);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int n) {
        int[] digits = getDigitsArray(n);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }
    public static int[][] findDigitFrequency(int n) {
        int[] digits = getDigitsArray(n);
        int[][] f = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            f[i][0] = i;
        }

        for (int digit : digits) {
            f[digit][1]++;
        }

        return f;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Count of digits: " + countDigits(n));

        int[] digitsArray = getDigitsArray(n);
        System.out.print("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(n));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(n));
        System.out.println("Is Harshad number: " + isHarshadNumber(n));
        int[][] f = findDigitFrequency(n);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < f.length; i++) {
            if (f[i][1] > 0) {
                System.out.println("Digit: " + f[i][0] + ", Frequency: " + f[i][1]);
            }
        }
    }
}

