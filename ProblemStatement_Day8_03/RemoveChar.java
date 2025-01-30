import java.util.Scanner;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);
        
        // Removing the character
        String result = removeCharacter(input, charToRemove);
        
        // Displaying the modified string
        System.out.println("Modified String: " + result);
    }
    
    public static String removeCharacter(String str, char ch) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i); // Concatenating characters
            }
        }
        
        return result;
    }
}

