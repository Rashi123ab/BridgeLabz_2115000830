import java.util.*;
public class Removeduplicates{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=removeDuplicates(s);
        System.out.println("String after removing duplicates: " +ans);
    }
    public static String removeDuplicates(String s){
        LinkedHashSet<Character> set=new LinkedHashSet<>();//Maintains insertion order
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

