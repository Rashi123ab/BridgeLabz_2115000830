import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
class Student {
    private String name;
    private int age;
    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
public class ListToJSONArray {
    public static void main(String[] args) {
        try {
            List<Student> list = Arrays.asList(
                    new Student("Rashi", 22),
                    new Student("Shantanu", 22),
                    new Student("Diksha", 23)
            );
            ObjectMapper Mapper = new ObjectMapper();
            String jsonArray = Mapper.writeValueAsString(list);

            // Print JSON Output
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
