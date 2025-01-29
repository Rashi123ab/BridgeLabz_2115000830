import java.util.Scanner;
public class Count{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        System.out.println("Enter the substring to find:");
        String subString = sc.nextLine();
        int count = countOccurrences(mainString, subString);
        System.out.println("Occurrences of \"" + subString + "\": " + count);
    }
    // Method to count occurrences of substring
    public static int countOccurrences(String mainString, String subString) {
        if (subString.isEmpty()) {
            return 0; // Prevent infinite loop if substring is empty
        }

        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index++; // Move index by 1 to check for overlapping occurrences
        }

        return count;
    }
}

