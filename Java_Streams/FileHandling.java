import java.io.*;
public class FileHandling{
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Input.txt");
             FileOutputStream fos = new FileOutputStream("Output.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied.");
        } 
        catch(FileNotFoundException e){
            System.out.println("error:File not found");
            }catch (IOException e) {
            System.out.println("error:I/O error occured");
            e.printStackTrace();
        }
    }
}
