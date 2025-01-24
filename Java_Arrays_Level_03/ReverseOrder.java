import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num% 10;
            num /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}

