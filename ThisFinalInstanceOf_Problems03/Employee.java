import java.util.Scanner;
class Employee {
    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter designation: ");
        String designation = sc.nextLine();
        
        Employee employee = new Employee(name, id, designation);
        if(employee instanceof Employee){
        Employee.displayTotalEmployees();
        employee.display();
}else{
System.out.println("not instance");
}
    }
}
