import java.util.*;
public class Checknum{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         int ans=Check(n);
         if(ans==-1){
           System.out.println("The number entered is negative.");
         }else if(ans==1){
           System.out.println("The number entered is positive.");
         }else{
           System.out.println("The number entered is zero.");
         }
     }
     public static int Check(int n){
        if(n<0){
           return -1;
        }else if(n>0){
           return 1;
        }else{
           return 0;
        }
     }
 }




