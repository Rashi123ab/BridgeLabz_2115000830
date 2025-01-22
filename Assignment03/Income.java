import java.util.*;
class Income{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the salary: ");
double salary=sc.nextDouble();
System.out.print("Enter the bonus: ");
double bonus=sc.nextDouble();
double total_Income=salary+bonus;
System.out.println("The salary is " + salary + " and bonus is " + bonus +
                           ". Hence Total Income is " + total_Income);
    }
}
