import java.io.*;
public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "output.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Name,Department,Salary\n");
            writer.write("104,Rashi,Finance,62000\n");
            writer.write("105,Shantanu,Tech,89000\n");
            writer.write("106,Diksha,Tech,89000\n");
            writer.write("107,Riya,Sales,19000\n");
            writer.write("108,Shaan,Tech,89000\n");
            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

