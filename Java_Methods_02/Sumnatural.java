import java.util.*;
public class Sumnatural{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int res=calculate(n);
        System.out.println(res);
    }
    public static int calculate(int n){
       int sum=0;
       for(int i=1;i<=n;i++){
          sum+=i;
       }
       return sum;
    }
}
