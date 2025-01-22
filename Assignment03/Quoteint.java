import java.util.*; 
public class Quoteint{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int firstNo=sc.nextInt();
int secondNo=sc.nextInt();
int q=firstNo/secondNo;
int r=firstNo%secondNo;
System.out.println("The Quotient is " + q + " and Remainder is "+ r+ " of the two numbers " + firstNo + " and " + secondNo);
}
}
