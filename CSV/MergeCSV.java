import java.io.*;
import java.util.*;
class Students{
    String id;
    String name;
    int age;
    double marks;
    String grade;
    public Students(String id, String name, int age, double marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + marks + "," + grade;
    }
}

public class MergeCSV{
    public static void main(String[] args) {
        String file1= "student1.csv";
        String file2= "student2.csv";
        String output = "New_students.csv";
        Map<String, Students> studentMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            boolean isFirst = true;
            while ((line = br.readLine()) != null) {
                if (isFirst) {
                    isFirst = false;
                    continue;
                }
                String[] values = line.split(",");
                String id = values[0].trim();
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());
                studentMap.put(id, new Students(id, name, age, 0.0, ""));
            }
        } catch (IOException e) {
            System.out.println("Error reading file1: " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            boolean isFirst= true;
            while ((line = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                String[] values = line.split(",");
                String id = values[0].trim();
                double marks = Double.parseDouble(values[1].trim());
                String grade = values[2].trim();
                if (studentMap.containsKey(id)) {
                    Students student = studentMap.get(id);
                    student.marks = marks;
                    student.grade = grade;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file2: " + e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();
            for (Students student : studentMap.values()) {
                bw.write(student.toString());
                bw.newLine();
            }
            System.out.println("Merged file:" + output);
        } catch (IOException e) {
            System.out.println("Error writing merged file: " + e.getMessage());
        }
    }
}