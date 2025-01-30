import java.util.*;
public class LongestWord{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String:");
      String s=sc.nextLine();
      String[] words=s.split("\\s+");
      String ans="";
      for(String word:words){
         if(word.length()>ans.length()){
            ans=word;
         }
      }
      System.out.println("Longest word is: "+ans);
  }
}
