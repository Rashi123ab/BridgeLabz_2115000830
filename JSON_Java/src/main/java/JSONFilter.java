import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
class Person {
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class JSONFilter{
    public static void main(String[] args) {
        try {
             ObjectMapper objectMapper = new ObjectMapper();
             List<Person> list = objectMapper.readValue(
                    new File("E:\\JSON_Java\\src\\main\\java\\info.json"),
                    new TypeReference<List<Person>>() {}
            );
             List<Person> filtered = new ArrayList<>();
            for (Person person : list) {
                if (person.getAge() > 25) {
                    filtered.add(person);
                }
            }

            for (Person person : filtered) {
                System.out.println(person);
            }
            //Convert filtered list back to JSON
            String filteredJson = objectMapper.writeValueAsString(filtered);
            System.out.println("\nFiltered JSON: " + filteredJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
