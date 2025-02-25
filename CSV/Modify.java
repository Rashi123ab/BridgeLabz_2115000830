import java.io.*;
class Modify{
    public static void main(String[] args) {
        String input = "employees.csv";
        String output= "new_employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            String line;
            boolean isFirst = true;
            while ((line = br.readLine()) != null) {
                if (isFirst) {
                    bw.write(line);
                    bw.newLine();
                    isFirst= false;
                    continue;
                }

                String[] values = line.split(",");
                String name = values[0].trim();
                String department = values[1].trim();
                double salary = Double.parseDouble(values[2].trim());
                if (department.equalsIgnoreCase("IT")) {
                    salary *= 1.10; // Increase salary by 10%
                }
                bw.write(name + "," + department + "," + String.format("%.2f", salary));
                bw.newLine();
            }

            System.out.println("Updated file: " + output);
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
