import java.io.*;
class ReadLargeFiles{
    public static void main(String[] args) {
        String filePath = "largedata.csv";
        int batchSize = 100;
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirst= true;
            int batchCount = 0;
            while ((line = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                total++;
                batchCount++;

                if (batchCount == batchSize) {
                    System.out.println("Processed " + total+ " records so far...");
                    batchCount = 0;
                }
            }
            System.out.println("Total records processed: " + total);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


