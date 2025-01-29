import java.util.*;
public class CountVowels{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Input string:");
       String s=sc.next();
       int vowels=0, consonants=0;
       for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' || s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
               vowels++;
          }else{
               consonants++;
          }
       }
       System.out.println("Number of vowels are "+vowels+"& number of consonants are "+consonants);
   }
}
