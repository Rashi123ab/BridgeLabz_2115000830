import java.io.*;
import java.util.*;
public class ReadCSV{
    public static void main(String[] args) {
        String filePath = "Rashi.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String l;
            if ((l= br.readLine()) != null) {
                System.out.println("CSV Headers: " + l);
            }
            System.out.println("\nStudent Details:");
            while ((l= br.readLine()) != null) {
                String[] data = l.split(",");
                System.out.printf("ID: %s | Name: %s | Age: %s | Marks: %s%n", data[0], data[1], data[2], data[3]);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
