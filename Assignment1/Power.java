import java.util.*;
public class Power{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int exp=sc.nextInt();
		double result = Math.pow(a,exp);
		System.out.println("Answer = " + result);
	}
}