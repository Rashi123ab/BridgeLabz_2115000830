class Employee{
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    String prog;
    Developer(String name,int id,int salary,String prog){
        super(name,id,salary);
        this.prog=prog;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + prog);
    }
}
class Intern extends Employee{
    String University;
    Intern(String name,int id,int salary,String University){
        super(name,id,salary);
        this.University=University;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Intern details");
    }
}
class EmployeeManagement{
    public static void main(String[] args) {
        Employee emp1 = new Manager("Rashi", 101, 75000, 10);
        Employee emp2 = new Developer("Shan", 102, 60000, "Java");
        Employee emp3 = new Intern("Vivek", 103, 20000, "GLA");

        System.out.println("Employee Details:");
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();
        emp3.displayDetails();
    }
}
