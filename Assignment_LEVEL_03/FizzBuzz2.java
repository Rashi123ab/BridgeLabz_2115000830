import java.util.*;
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is positive or not
        if (num > 0) {
            System.out.println("FizzBuzz results:");

            int i = 0;
            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
        else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
        else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
        else {
                    System.out.println(i);
                }
                i++;
            }
        }
    else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
