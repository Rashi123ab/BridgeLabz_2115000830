import java.util.*;
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void listEmployees() {
        System.out.println("Employees in " + name + " Department:");
        for (Employee e : employees) {
            System.out.println("- " + e.getName());
        }
    }
}
// Company class that contains multiple departments (Composition)
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String employeeName) {
        for (Department dept : departments) {
            if (deptName.equals(deptName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + deptName);
    }

    public void listDepartmentsAndEmployees() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.listEmployees();
        }
    }
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Alice");
        company.addEmployeeToDepartment("IT", "Bob");
        company.addEmployeeToDepartment("HR", "Charlie");

        company.listDepartmentsAndEmployees();
    }
}
