import java.util.*;
public class SwapNum{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("first number: ");
int num1=sc.nextInt();
System.out.print("second number: ");
int num2=sc.nextInt();
int temp=num1;
num1=num2;
num2=temp;
System.out.println("The swapped numbers are " + num1 + " and " + num2);
}
}

