import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to search: ");
        String subString = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            if (mainString.substring(i, i + subString.length()).equals(subString)) {
                count++;
            }
        }
        
        System.out.println("Occurrences: " + count);
    }
}

