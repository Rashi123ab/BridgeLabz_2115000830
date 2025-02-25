import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FilterRecords{
    public static void main(String[] args) {
        String filePath = "marks.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String l;
            boolean isFirst= true;
            while ((l = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                String[] values= l.split(",");
                int Marks = Integer.parseInt(values[1].trim());
                if (Marks > 80) {
                    System.out.println(l);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}