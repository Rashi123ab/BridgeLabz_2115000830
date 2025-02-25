import java.io.*;
import java.util.*;
class Student {
    String name;
    int age;
    double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "name='" + name + "', age=" + age + ", grade=" + grade;
    }
}

public class Convert{
    public static void main(String[] args) {
        String filePath = "student.csv";
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirst= true;

            while ((line = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                String[] values = line.split(",");
                String name = values[0].trim();
                int age = Integer.parseInt(values[1].trim());
                double grade = Double.parseDouble(values[2].trim());
                students.add(new Student(name, age, grade));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
