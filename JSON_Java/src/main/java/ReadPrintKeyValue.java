import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
public class ReadPrintKeyValue{
    public static void main(String[] args) {
        try {
             ObjectMapper Mapper = new ObjectMapper();
             JsonNode rootNode = Mapper.readTree(new File("E:\\JSON_Java\\src\\main\\java\\rashi.json"));
             printall(rootNode, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printall(JsonNode node, String Key) {
        if (node.isObject()) {
            // Iterate through all key-value pairs
            Iterator<Map.Entry<String, JsonNode>> f = node.fields();
            while (f.hasNext()) {
                Map.Entry<String, JsonNode> entry = f.next();
                String K = entry.getKey();
                JsonNode value = entry.getValue();
                printall(value, Key.isEmpty() ? K :Key + "." + K);
            }
        } else if (node.isArray()) {
             for (int i = 0; i < node.size(); i++) {
                printall(node.get(i), Key + "[" + i + "]");
            }
        } else {
             System.out.println(Key + " : " + node.asText());
        }
    }
}
