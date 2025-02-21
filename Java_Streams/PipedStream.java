import java.io.*;
class WriterThread extends Thread {
    private PipedOutputStream pos;
    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String message = "Message " + i;
                pos.write(message.getBytes());
                pos.write('\n');
                Thread.sleep(500);
            }
            pos.close();
        } catch (IOException | InterruptedException e) {
            System.err.println("error: " + e.getMessage());
        }
    }
}
class ReaderThread extends Thread {
    private PipedInputStream pis;
    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Received: " + line);
            }
        } catch (IOException e) {
            System.err.println("error: " + e.getMessage());
        }
    }
}
public class PipedStream{
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            WriterThread w = new WriterThread(pos);
            ReaderThread r = new ReaderThread(pis);
            w.start();
            r.start();
        } catch (IOException e) {
            System.err.println("error: " + e.getMessage());
        }
    }
}
