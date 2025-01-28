import java.util.*;
public class Athlete{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input the sides
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = sc.nextDouble();
        //number of rounds
        int rounds = calculate(side1, side2, side3);
        // Print
        if (rounds == -1) {
            System.out.println("Invalid triangle sides provided.");
        } else {
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        }
    }
    // Method to calculate the number of rounds required
    public static int calculate(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            //perimeter of the triangle
            double perimeter = side1 + side2 + side3;
            double totalDistance = 5000.0;
            int rounds = (int) Math.ceil(totalDistance / perimeter); // Use ceil to round up to the nearest whole number
return rounds;
        } else {
            return -1;
        }
}
}
