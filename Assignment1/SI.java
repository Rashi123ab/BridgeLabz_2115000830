import java.util.*;
public class SI{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int P =sc.nextInt();
		double Rate = sc.nextDouble();
		double Time=sc.nextDouble();
		double SI=(P*Rate*Time)/100;
		System.out.println("Simple interest:"+ SI);
	}
}