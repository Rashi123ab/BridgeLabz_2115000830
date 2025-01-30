import java.util.*;
public class Anagram{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first string: ");
       String s1 = sc.nextLine();
       System.out.print("Enter the second string: ");
       String s2 = sc.nextLine();

       if(Anagrams(s1,s2)){
           System.out.println("The two strings are anagrams.");
       }
       else {
           System.out.println("The two strings are not anagrams.");
       }
   }

   public static boolean Anagrams(String s1, String s2) {
       if(s1.length()!=s2.length()){
           return false;
       }
       char[] arr1 = s1.toCharArray();
       char[] arr2 = s2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1, arr2);
   }
}
