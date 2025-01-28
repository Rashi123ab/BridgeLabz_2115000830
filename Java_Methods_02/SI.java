import java.util.*;
public class SI{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle:");
        double principle=sc.nextInt();
        System.out.println("Enter the rate:");
        double rate=sc.nextInt();
        System.out.println("Enter the time:");
        double time=sc.nextInt();
        double res=calculate(principle, rate,time);
        System.out.println("The simple interest is "+res);
    }
    public static double calculate(double P,double R,double T){
        double res=(P*R*T)/100;
        return res;
    }
}




