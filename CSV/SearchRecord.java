import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class SearchRecord{
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String searchName = sc.nextLine().trim();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstRow = true;
            boolean avl = false;

            while ((line = br.readLine()) != null) {
                if (isFirstRow) {
                    isFirstRow = false; // Skip header row
                    continue;
                }
                String[] values = line.split(",");
                String name = values[0].trim();
                String department = values[1].trim();
                String salary = values[2].trim();
                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    avl = true;
                    break;
                }
            }
            if (!avl) {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

