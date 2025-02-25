import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountRow{
    public static void main(String[] args) {
        String filePath = "output.csv";
        int rowCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstRow = true;
            while ((line = br.readLine()) != null) {
                if (isFirstRow) {
                    isFirstRow = false;
                    continue;
                }
                rowCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("Number of records: " + rowCount);
    }
}
