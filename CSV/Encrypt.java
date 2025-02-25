import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Encrypt{
    private static final String ALGORITHM = "AES";
     public static SecretKey generateKey() throws Exception {
        KeyGenerator Generator = KeyGenerator.getInstance(ALGORITHM);
        Generator.init(128);
        return Generator.generateKey();
    }
    // Encrypt a value
    public static String encrypt(String value, SecretKey K) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, K);
        byte[] encrypted = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encrypted);
    }
    // Decrypt a value
    public static String decrypt(String value, SecretKey K) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, K);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(value));
        return new String(decrypted, StandardCharsets.UTF_8);
    }
    // Write encrypted data to CSV
    public static void writeEncryptedCSV(String fileName, List<String[]> data, SecretKey K) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Name,Email,Salary\n");
            for (String[] row : data) {
                writer.write(row[0] + "," + encrypt(row[1], K) + "," + encrypt(row[2], K) + "\n");
            }
        }
    }
    // Read and decrypt data from CSV
    public static List<String[]> readDecryptedCSV(String fileName, SecretKey key) throws Exception {
        List<String[]> decryptedData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                decryptedData.add(new String[]{parts[0], decrypt(parts[1], key), decrypt(parts[2], key)});
            }
        }
        return decryptedData;
    }

    public static void main(String[] args) {
        try {
            SecretKey K = generateKey();
            List<String[]> employees = List.of(
                    new String[]{"Rashi", "rashi@gmail.com", "70000"},
                    new String[]{"Shantanu", "shantanu@example.com", "80000"}
            );
            String file= "employees.csv";
            writeEncryptedCSV(file, employees, K);
            List<String[]> decryptedData = readDecryptedCSV(file, K);

            System.out.println("Decrypted Data:");
            for (String[] row : decryptedData) {
                System.out.println("Name: " + row[0] + ", Email: " + row[1] + ", Salary: " + row[2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
