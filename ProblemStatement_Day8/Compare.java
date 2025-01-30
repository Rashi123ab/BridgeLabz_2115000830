import java.util.*;
public class Compare{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String 1: ");
       String s1 = sc.nextLine();
       System.out.print("Enter String 2: ");
       String s2 = sc.nextLine();
       int res=compareLexicographically(s1, s2);
       if(res<0){
           System.out.println(s1 + " comes before " + s2 + " in lexicographical order.");
       }else if(res>0){
           System.out.println(s1 + " comes after " + s2 + " in lexicographical order.");
       }else{
           System.out.println(s1 + " is equal to " + s2 + " lexicographically.");
       }
   }
   public static int compareLexicographically(String s1,String s2) {
       int length1=s1.length();
       int length2=s2.length();
       int minLength=Math.min(length1,length2);
       for(int i=0;i<minLength;i++){
           if(s1.charAt(i)!=s2.charAt(i)){
               return s1.charAt(i)-s2.charAt(i);
           }
       }
       return length1-length2;
   }
}

