import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import java.io.File;
import java.io.IOException;
import java.util.Set;
public class JSONValidation{
    public static void main(String[] args) {
        try {
            ObjectMapper Mapper = new ObjectMapper();
            JsonNode schemaNode = Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\schema.json"));
            JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema = schemaFactory.getSchema(schemaNode);
            JsonNode jsonNode = Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\data.json"));
            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println("JSON is valid!");
            } else {
                System.out.println("JSON validation errors:");
                errors.forEach(error -> System.out.println(error.getMessage()));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
