import java.util.*;
public class Weight{
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	// Taking user input for weight in pounds
        	System.out.print("Enter the weight in pounds:");
        	double InPounds=sc.nextDouble();
        	// Conversion factor:1 pound = 2.2 kg
        	double weightInKg=InPounds*2.2;
        	System.out.println("The weight of the person in pounds is "+InPounds+
                           " and in kilograms is "+weightInKg);
	}
}
