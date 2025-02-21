import java.io.*;
public class FileCopyComparison {
String source= "Input.txt";
        String destination= "Output.txt";
    private static final int BUFFER_SIZE = 4096; // 4KB
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCopyComparison <source file> <destination file>");
            return;
        }

        String sourceFile = args[0];
        String destinationBuffered = args[1] + "buffered";
        String destinationUnbuffered = args[1] + "unbuffered";
 
        long startTimeBuffered = System.nanoTime();
        BufferedStreams(sourceFile, destinationBuffered);
        long endTimeBuffered = System.nanoTime();
        long bufferedTime = endTimeBuffered - startTimeBuffered;

        long startTimeUnbuffered = System.nanoTime();
        UnbufferedStreams(sourceFile, destinationUnbuffered);
        long endTimeUnbuffered = System.nanoTime();
        long unbufferedTime = endTimeUnbuffered - startTimeUnbuffered;
        System.out.println("Buffered Stream Copy Time: " + (bufferedTime / 1000000.0) + " ms");//converting in ms
        System.out.println("Unbuffered Stream Copy Time: " + (unbufferedTime / 1000000.0) + " ms");//converting in ms
    }

    private static void BufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void UnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
