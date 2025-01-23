import java.util.*;
public class Bonusemployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int years = sc.nextInt();

        // Check,employee is eligible for the bonus
        if (years> 5) {
            // Calculate the bonus
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
