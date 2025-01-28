import java.util.*;
public class Handshakes{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("number of students:");
      int n=sc.nextInt();
      int res=calculate(n);
      System.out.println("The maximum number of handshakes among N number of students is "+res);
    }
    public static int calculate(int n){
       int res=(n*(n-1))/2;
       return res;
    }
}


