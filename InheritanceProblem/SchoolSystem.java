class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }

    public void displayRole(){
        System.out.println("Teacher Role");
    }
}

class Student extends Person {
   String grade;

    Student(String name, int age, String grade) {
        super(name,age);
        this.grade=grade;
    }

    public void displayRole() {
        System.out.println("Student role");
    }
}

class Staff extends Person {
    String work;

    Staff(String name, int age,String work) {
        super(name,age);
        this.work=work;
    }

    public void displayRole() {
        System.out.println("Staff Role");
    }
}
class SchoolSystem{
    public static void main(String[] args) {
        Teacher teach = new Teacher("Ashutosh Chaudhary",30,"ComputerScience");
        Student study = new Student("Rashi",21,"A");
        Staff staffing= new Staff("Ankit",35,"cleaning");

        teach.displayRole();
        study.displayRole();
        staffing.displayRole();
    }
}
