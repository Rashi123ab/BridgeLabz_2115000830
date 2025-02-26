import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSONObject{
    public static void main(String[] args) {
        try {
            ObjectMapper Mapper = new ObjectMapper();
            String obj1 = "{ \"name\": \"Rashi\", \"age\": 21 }";
            ObjectNode node1 = (ObjectNode) Mapper.readTree(obj1);
            String obj2 = "{ \"email\": \"rashi@example.com\", \"city\": \"Varanasi\" }";
            ObjectNode node2 = (ObjectNode) Mapper.readTree(obj2);
            node1.setAll(node2);
             String mergedJson = Mapper.writeValueAsString(node1);

             System.out.println(mergedJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
