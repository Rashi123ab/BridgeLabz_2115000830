import java.util.*;
public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int num1 = sc.nextInt();
        System.out.print("second number: ");
        int num2 = sc.nextInt();
        System.out.print("third number: ");
        int num3 = sc.nextInt();

        // Check,number is the largest
        boolean isFirstNumberLargest = (num1 > num2 && num1 > num3);
        boolean isSecondNumberLargest = (num2 > num1 && num2 > num3);
        boolean isThirdNumberLargest = (num3 > num1 && num3 > num2);

        System.out.println("Is the first number the largest? " + (isFirstNumberLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondNumberLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdNumberLargest ? "Yes" : "No"));
    }
}
