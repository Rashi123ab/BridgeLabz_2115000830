import java.util.*;
public class ToggleCase{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s= sc.nextLine();
        String toggledStr = toggleCase(s);
        System.out.println("Toggled string: " + toggledStr);
    }

    public static String toggleCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }
}
