import java.util.Scanner;
public class ToggleCase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();// Read the string
        String toggledStr=toggleCase(s);
        System.out.println("Toggled string: " + toggledStr);
    }
    public static String toggleCase(String s){
        StringBuilder ans=new StringBuilder();
        // Loop through each character in the string
        for(int i=0;i< s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                // Convert
                ans.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)){
                ans.append(Character.toUpperCase(ch));
            }else{
                // If it's neither, append as is (like numbers or punctuation)
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

