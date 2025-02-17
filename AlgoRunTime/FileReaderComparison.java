import java.io.*;
class FileReaderComparison {
    static void usingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        int ch;
        while ((ch = fr.read()) != -1) {}
        fr.close();
    }

    static void usingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        int ch;
        while ((ch = isr.read()) != -1) {}
        isr.close();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "Rashi.txt";
        long start, end;
        
        start = System.currentTimeMillis();
        usingFileReader(filePath);
        end = System.currentTimeMillis();
        System.out.println("FileReader: " + (end - start) + "ms");
        
        start = System.currentTimeMillis();
        usingInputStreamReader(filePath);
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader: " + (end - start) + "ms");
    }
}
