import java.io.*;
public class UserInfoWriter {
    public static void main(String[] args) {
        String fileName = "Input.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) { 
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your favorite Programming language: ");
            String language = reader.readLine();
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming language: " + language + "\n");
            writer.write("----------------------\n");
            System.out.println("User information saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
            e.printStackTrace();
        }
    }
}
