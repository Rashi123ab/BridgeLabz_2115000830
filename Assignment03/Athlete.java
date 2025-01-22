import java.util.*;
public class Athlete{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("first side of the triangular park: ");
double s1=sc.nextDouble();
System.out.print("second side of the triangular park: ");
double s2=sc.nextDouble();
System.out.print("third side of the triangular park: ");
double s3=sc.nextDouble();
double perimeter=s1+s2+s3;
double totalDistance=5000.0;
double rounds=totalDistance/perimeter;
System.out.println("The total number of rounds the athlete will run is " +
                           (int)Math.ceil(rounds) + " to complete 5 km.");
}
}

