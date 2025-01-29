import java.util.*;
public class RemoveChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove=sc.next().charAt(0);

        String newStr = removeChar(s, charToRemove);
        System.out.println("New String: " + newStr );
    }

    public static String removeChar(String s, char charToRemove) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != charToRemove) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

