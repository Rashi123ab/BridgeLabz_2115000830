import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CSVToJSON{
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("E:\\JSON_Java\\src\\main\\java\\rashi.csv");
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
            ObjectMapper Mapper = new ObjectMapper();
            ArrayNode jsonArray = Mapper.createArrayNode();
            for (CSVRecord r : csvParser) {
                ObjectNode jsonObject = Mapper.createObjectNode();
                for (String header : csvParser.getHeaderNames()) {
                    jsonObject.put(header, r.get(header));
                }
                jsonArray.add(jsonObject);
            }
            String Output = Mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
            System.out.println(Output);
            Mapper.writeValue(new File("output.json"), jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
