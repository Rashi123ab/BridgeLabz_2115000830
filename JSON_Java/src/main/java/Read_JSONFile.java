import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class Read_JSONFile {
    public static void main(String[] args) {
        try {
            ObjectMapper Mapper = new ObjectMapper();
            JsonNode rootNode = Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\rashi.json"));
            // Extracting name and email
            String name = rootNode.path("name").asText();
            String email = rootNode.path("email").asText();
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
