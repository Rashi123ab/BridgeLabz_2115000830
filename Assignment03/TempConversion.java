import java.util.*;
class TempConversion{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the temperature in Fahrenheit: ");
double fahrenheit=sc.nextDouble();
double celsius=(fahrenheit - 32) * 5 / 9;//conversion
System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
}
}


