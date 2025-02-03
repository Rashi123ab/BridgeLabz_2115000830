import java.util.Scanner;
class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    void display(){
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();
        Student student = new Student(name, rollNumber, grade);
        if(student instanceof Student){
        Student.displayTotalStudents();
        student.display();
}else{
System.out.println("not an instance ");
}
    }
}
