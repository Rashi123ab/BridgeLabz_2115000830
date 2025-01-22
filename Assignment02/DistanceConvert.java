import java.util.Scanner;
public class DistanceConvert{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double km;
System.out.print("Enter the distance in kilometers: ");
km = sc.nextDouble();
double miles = km / 1.6; //Conversion
System.out.println("The total miles is "+miles+" miles for the given "+ km);
}
}

