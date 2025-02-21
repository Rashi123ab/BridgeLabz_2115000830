import java.io.*;
public class CaseConverter{
    public static void main(String[] args) {
        String input= "input.txt";
        String output= "output.txt";
        try (
                FileReader fr = new FileReader(input);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(output);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("Conversion completed.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
