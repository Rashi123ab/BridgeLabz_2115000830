import java.io.*;
import java.util.*;
class Employee {
    String name;
    String department;
    double salary;
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class SortCSV{
    public static void main(String[] args) {
        String filePath = "employees.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String l;
            boolean isFirst= true;
            while ((l = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                String[] values = l.split(",");
                String name = values[0].trim();
                String department = values[1].trim();
                double salary = Double.parseDouble(values[2].trim());

                employees.add(new Employee(name, department, salary));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(e.name + " - " + e.department + " - " + e.salary);
        }
    }
}

