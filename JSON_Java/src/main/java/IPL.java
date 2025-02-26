import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.util.*;
public class IPL{
    public static void main(String[] args) {
        try {
            processJson("E:\\JSON_Java\\src\\main\\java\\input.json", "censored_input.json");
            processCsv("E:\\JSON_Java\\src\\main\\java\\input.csv", "censored_input.csv");
        } catch (IOException e) {
            System.err.println("File handling error: " + e.getMessage());
        } catch (CsvException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void processJson(String inputFile, String outputFile) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Map<String, Object>> matches = objectMapper.readValue(new File(inputFile), new TypeReference<List<Map<String, Object>>>() {});

            for (Map<String, Object> match : matches) {
                censorMatch(match);
            }

            objectMapper.writeValue(new File(outputFile), matches);
            System.out.println("Censored JSON " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing JSON file: " + e.getMessage());
        }
    }
    private static void processCsv(String inputFile, String outputFile) throws IOException, CsvException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             CSVReader csvReader = new CSVReader(reader);
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             CSVWriter csvWriter = new CSVWriter(writer)) {
            List<String[]> allData;
            try {
                allData = csvReader.readAll();
            } catch (CsvException e) {
                System.err.println("Error reading CSV: " + e.getMessage());
                return;
            }
            if (allData.isEmpty()) return;
            csvWriter.writeNext(allData.get(0));
            for (int i = 1; i < allData.size(); i++) {
                String[] row = allData.get(i);
                if (row.length < 7) {
                    System.out.println("Skipping invalid row at line " + (i + 1) + ": " + Arrays.toString(row));
                    continue;
                }
                row[1] = censorTeam(row[1]);
                row[2] = censorTeam(row[2]);
                row[5] = censorTeam(row[5]);
                row[6] = "REDACTED";
                csvWriter.writeNext(row);
            }
        }
        System.out.println("Censored CSV " + outputFile);
    }
    private static void censorMatch(Map<String, Object> match) {
        match.put("team1", censorTeam((String) match.get("team1")));
        match.put("team2", censorTeam((String) match.get("team2")));
        match.put("winner", censorTeam((String) match.get("winner")));
        match.put("player_of_match", "REDACTED");
    }
    private static String censorTeam(String team) {
        if (team == null || team.isEmpty()) return team;
        String[] words = team.split(" ");
        return words.length > 1 ? words[0] + " ***" : team;
    }
}
