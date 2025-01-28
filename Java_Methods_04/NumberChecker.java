import java.util.*;
public class NumberChecker{
	public static int count(int n) {
            return String.valueOf(n).length();
        }
        public static int[] getDigitsArray(int n) {
            String numStr = String.valueOf(n);
            int[] digits = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                    digits[i] = numStr.charAt(i) - '0';
            }
            return digits;
        }
        public static boolean isDuckNum(int[] digitsArray) {
            for (int i = 1; i < digitsArray.length; i++) {
                    if (digitsArray[i] == 0) {
                        return true;
                    }
            }
            return false;
        }
        public static boolean isArmstrongNum(int n) {
            int[] digitsArray = getDigitsArray(n);
            int sum = 0;
            int power = digitsArray.length;
            for (int digit : digitsArray) {
                    sum += Math.pow(digit, power);
            }
            return sum == n;
        }
        public static int[] findLargestSecondLargest(int[] digitsArray) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int digit : digitsArray) {
                    if (digit > largest) {
                        secondLargest = largest;
                        largest = digit;
                    }
            else if (digit > secondLargest && digit != largest) {
                        secondLargest = digit;
                    }
            }
            return new int[]{largest, secondLargest};
        }
        public static int[] findSmallestSecondSmallest(int[] digitsArray) {
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int digit : digitsArray) {
                    if (digit < smallest) {
                        secondSmallest = smallest;
                        smallest = digit;
                    }
            else if (digit < secondSmallest && digit != smallest) {
                        secondSmallest = digit;
                    }
            }
        return new int[]{smallest, secondSmallest};
        }
		public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

            System.out.println("number: " + n);
            System.out.println("Count of digits: " + count(n));

            int[] digitsArray = getDigitsArray(n);
            System.out.print("Digits array: ");
            for (int digit : digitsArray) {
                    System.out.print(digit + " ");
            }
            System.out.println();

            System.out.println("Is Duck Number: " + isDuckNum(digitsArray));
            System.out.println("Is Armstrong Number: " + isArmstrongNum(n));

            int[] largestAndSecondLargest = findLargestSecondLargest(digitsArray);
            System.out.println("Largest digit: " + largestAndSecondLargest[0]);
            System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

            int[] smallestAndSecondSmallest = findSmallestSecondSmallest(digitsArray);
            System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
            System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
        }
}

