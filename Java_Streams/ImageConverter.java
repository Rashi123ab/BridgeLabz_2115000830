import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
public class ImageConverter{
    public static void main(String[] args) {
        String input= "input.jpeg";
        String output= "output.jpeg";
        try {
            byte[] imageBytes = convertImageToByteArray(input);
            writeByteArrayToImage(imageBytes, output);
            if (verifyImages(input, output)) {
                System.out.println("The original and new image files are identical.");
            } else {
                System.out.println("The original and new image files are not identical.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
    private static boolean verifyImages(String imagePath1, String imagePath2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(imagePath1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(imagePath2).toPath());
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}
