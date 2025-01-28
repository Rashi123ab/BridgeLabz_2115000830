public class NumberChecker3{
     public static int countDigits(int n) {
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
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n) {
        int[] digits = getDigitsArray(n);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    public static boolean isDuckNumber(int n) {
        int[] digits = getDigitsArray(n);
        for (int digit : digits) {
            if (digit == 0) {
                return true;  
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1221;
        int n2 = 10234;

        System.out.println("Count of digits: " + countDigits(n));

        int[] digitsArray = getDigitsArray(n);
        System.out.print("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedArray = reverseDigitsArray(digitsArray);
        System.out.print("Reversed digits array: ");
        for (int digit : reversedArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean arraysEqual = areArraysEqual(digitsArray, reversedArray);
        System.out.println("Are digits array and reversed array equal? " + arraysEqual);
        System.out.println("Is " + n + " a palindrome? " + isPalindrome(n));
        System.out.println("Is " + n + " a duck number? " + isDuckNumber(n));
        System.out.println("Is " + n2 + " a duck number? " + isDuckNumber(n2));
    }
}
