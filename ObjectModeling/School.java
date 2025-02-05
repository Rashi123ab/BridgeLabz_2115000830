import java.util.ArrayList;
import java.util.List;
// Define course class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Enroll student to the course
    public void enrollStudent(Student stu) {
        if (!enrolledStudents.contains(stu)) {
            enrolledStudents.add(stu);
        }
    }

    // Display enrolled students
    public void showEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (Student stu : enrolledStudents) {
            System.out.println(stu.getName());
        }
    }
}

// Define Student Class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInCourse(Course cour) {
        if (!courses.contains(cour)) {
            courses.add(cour);
            cour.enrollStudent(this); // Maintain bidirectional relationship
        }
    }

    // Display enrolled courses
    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course cour : courses) {
            System.out.println(cour.getCourseName());
        }
    }
}

// Define School Class
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student stu) {
        if (!students.contains(stu)) {
            students.add(stu);
        }
    }

    // Show all students in the school
    public void showAllStudents() {
        System.out.println("Students in " + name + ":");
        for (Student stu : students) {
            System.out.println(stu.getName());
        }
    }
public static void main(String[] args) {
        // Create a school
        School mySchool = new School("Modern Academy International");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

        // Create students
        Student s = new Student("Rashi");
        Student s1 = new Student("Agrawal");

        // Enroll students in courses
        s.enrollInCourse(math);
        s.enrollInCourse(science);
        s1.enrollInCourse(science);
        s1.enrollInCourse(english);
        mySchool.addStudent(s);
        mySchool.addStudent(s1);
        mySchool.showAllStudents();
        s.showEnrolledCourses();
        s1.showEnrolledCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        english.showEnrolledStudents();
    }
}
