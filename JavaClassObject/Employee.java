public class Employee{
   public static void main(String args[]){
     Employeedetail emp=new Employeedetail("Rashi",100,3000);
     emp.display();
   }
}
class Employeedetail{
   String name;
   int id;
   double salary;
   public Employeedetail(String name, int id, double salary){
       this.name=name;
       this.id=id;
       this.salary=salary;
  }
  public void display(){
        System.out.println("The employee name is "+name);
        System.out.println("The employee id is "+id);
        System.out.println("The employee salary is "+salary);
  }
}

