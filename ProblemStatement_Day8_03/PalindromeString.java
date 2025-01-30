import java.util.*;
public class PalindromeString{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string:");
       String s=sc.next();
       char []Array=s.toCharArray();
       int i=0, j=s.length()-1;
       while(i<j){
          char temp=Array[i];
          Array[i]=Array[j];
          Array[j]=temp;
          i++;
          j--;
       }
       String ans=new String(Array);
       if(ans.equals(s)){
           System.out.println("It is palindrome.");
       }else{
           System.out.println("Not a palindrome.");
       }
    }
}

