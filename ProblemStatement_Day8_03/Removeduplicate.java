import java.util.*;
public class Removeduplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String result = removeDuplicates(s);
        System.out.println("After removing duplicates: " + result);
    }
    public static String removeDuplicates(String s){
        String result=""; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!isCharPresent(result,ch)){
                result+=ch; 
            }
        }
        return result;
    }
    public static boolean isCharPresent(String s,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return true;
            }
        }
        return false; 
    }
}
