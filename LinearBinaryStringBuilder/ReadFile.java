import java.io.*;
public class ReadFile{
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Rashi.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
