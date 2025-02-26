import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;
import java.io.File;
import java.io.IOException;
import java.util.Set;
public class EmailValidation{
    public static void main(String[] args) {
        try {
             ObjectMapper Mapper = new ObjectMapper();
             JsonNode schemaNode = Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\email.json"));
             JsonSchemaFactory factory = JsonSchemaFactory.getInstance();
             JsonSchema schema = factory.getSchema(schemaNode);
             JsonNode jsonData =Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\valid.json"));
             Set<ValidationMessage> validationMessages = schema.validate(jsonData);

             if (validationMessages.isEmpty()) {
                System.out.println("JSON is valid!");
            } else {
                System.out.println("JSON validation failed!");
                validationMessages.forEach(msg -> System.out.println(msg.getMessage()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
