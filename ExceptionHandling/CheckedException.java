import java.io.*;
public class CheckedException{
    public static void main(String[] args) {
        String fileName = "rashi.txt";
        try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
