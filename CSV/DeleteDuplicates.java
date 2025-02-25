import java.io.*;
import java.util.*;
public class DeleteDuplicates{
    public static void main(String[] args) {
        String filePath = "data.csv";
        detect(filePath);
    }
    public static void detect(String filePath) {
        Map<String, List<String>> mpp = new HashMap<>();
        List<String> Records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            System.out.println("Header: " + header);
            String l;
            while ((l = br.readLine()) != null) {
                String[] values = l.split(",");
                if (values.length > 0) {
                    String id = values[0].trim();
                    if (mpp.containsKey(id)) {
                        Records.add(l);
                    }
                    mpp.putIfAbsent(id, new ArrayList<>());
                    mpp.get(id).add(l);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Records.isEmpty()) {
            System.out.println("No duplicate records");
        } else {
            System.out.println("Duplicate Records:");
            for (String record : Records) {
                System.out.println(record);
            }
        }
    }
}
