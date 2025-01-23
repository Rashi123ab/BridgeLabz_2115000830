import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        // Check , number is the smallest
        if (num1 < num2 && num1 < num3) {
            System.out.println("Is the first number the smallest? Yes");
        }
    else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}

