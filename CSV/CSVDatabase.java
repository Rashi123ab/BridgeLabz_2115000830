import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Employees{
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class CSVDatabase{
    public static void main(String[] args) {
        List<Employees> employees = getEmployeeData();
        String fileName = "employee_report.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Employee ID,Name,Department,Salary");
            writer.newLine();

            // Write employee data
            for (Employees emp : employees) {
                writer.write(emp.getId() + "," + emp.getName() + "," + emp.getDepartment() + "," + emp.getSalary());
                writer.newLine();
            }

            System.out.println("CSV report generated: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
        }
    }

    private static List<Employees> getEmployeeData() {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(101, "Rashi", "HR", 60000));
        employees.add(new Employees(102, "Shantanu", "IT", 75000));
        employees.add(new Employees(103, "Chetan", "Finance", 80000));
        employees.add(new Employees(104, "Diksha", "Marketing", 70000));
        return employees;
    }
}
