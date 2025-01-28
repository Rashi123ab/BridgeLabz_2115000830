import java.util.*;
public class SmallestLargest{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter the first number:");
      int N1=sc.nextInt();
      System.out.println("Enter the second number:");
      int N2=sc.nextInt();
      System.out.println("Enter the third number:");
      int N3=sc.nextInt();
      int ans[]=find(N1,N2,N3);
      System.out.println("The largest no. is "+ans[0]+" & the smallest number is "+ans[1]);
    }
    public static int[] find(int a, int b, int c){
        int ans[]=new int[2];
        if(a>b && a>c){
           ans[0]=a;
         }else if(b>a && b>c){
           ans[0]=b;
         }else{
           ans[0]=c;
         }
         if(a<b && a<c){
           ans[1]=a;
         }else if(b<a && b<c){
           ans[1]=b;
         }else{
           ans[1]=c;
         }
         return ans;
    }
}
