import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
class Record {
    private int id;
    private String name;
    private String value;
    public Record(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
public class JSONDatabase{
    public static void main(String[] args) {
        List<Record> list = fetchRecords();
        Gson gson = new Gson();
        String jsonData = gson.toJson(list);
        try (FileWriter file = new FileWriter("report.json")) {
            file.write(jsonData);
            System.out.println("JSON report generated successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static List<Record> fetchRecords() {
        List<Record> list = new ArrayList<>();
        list.add(new Record(1, "Rashi", "Data1"));
        list.add(new Record(2, "Riya", "Data2"));
        list.add(new Record(3, "Diksha", "Data3"));
        return list;
    }
}
