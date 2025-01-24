import java.util.Scanner;
public class Analysis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];

        System.out.print("Enter a number: ");
        num= sc.nextInt();

        while (num!= 0 && index < maxDigit) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int l = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > l) {
                secondLargest = l;
                l= digits[i];
            } else if (digits[i] > secondLargest && digits[i]!=l) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + l);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
