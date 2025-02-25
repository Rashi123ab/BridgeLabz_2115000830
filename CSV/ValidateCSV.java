import java.io.*;
import java.util.regex.*;
public class ValidateCSV{
    public static void main(String[] args) {
        String Path = "employees.csv";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^\\d{10}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);
        try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
            String l;
            boolean isFirst= true;
            while ((l = br.readLine()) != null) {
                if (isFirst) {
                    isFirst= false;
                    continue;
                }
                String[] values = l.split(",");
                String name = values[0].trim();
                String email = values[1].trim();
                String phone = values[2].trim();
                Matcher emailMatcher = emailPattern.matcher(email);
                Matcher phoneMatcher = phonePattern.matcher(phone);
                if (!emailMatcher.matches()) {
                    System.out.println("Invalid Email: " + email + " for Employee: " + name);
                }
                if (!phoneMatcher.matches()) {
                    System.out.println("Invalid Phone Number: " + phone + " for Employee: " + name);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
