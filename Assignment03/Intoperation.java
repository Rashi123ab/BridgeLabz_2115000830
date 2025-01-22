import java.util.*;
public class Intoperation{
public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("first number");
           int a=sc.nextInt();
           System.out.println("second number");
           int b=sc.nextInt();
           System.out.println("third number");
           int c=sc.nextInt();
           int res1= a + b *c;
           int res2=a * b + c;
           int res3= c + a / b;
           int res4=a % b + c;
           System.out.println("The result of above operations are "+ res1+","+res2+","+res3+","+res4);
     }
}
