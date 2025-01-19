import java.util.Scanner;
class Avg{
public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        double a = sc.nextDouble();
        System.out.print("Second number: ");
        double b = sc.nextDouble();
        System.out.print("Third number: ");
        double c = sc.nextDouble();
        System.out.print("Average is:" + avr(a,b,c));
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}