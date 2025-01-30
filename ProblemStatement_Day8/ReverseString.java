import java.util.*;
public class ReverseString{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Input string:");
       String s=sc.next();
       char [] charArray=s.toCharArray();
       int i=0, j=s.length()-1;
       while(i<j){
          char temp=charArray[i];
          charArray[i]=charArray[j];
          charArray[j]=temp;
          i++;
          j--;
       }
       String ans=new String(charArray);
       System.out.println("Reverse string is: "+ans);
    }
}

