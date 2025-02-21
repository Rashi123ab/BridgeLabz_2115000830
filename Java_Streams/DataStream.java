import java.io.*;
public class DataStream{
    public static void main(String[] args) {
        String filePath = "studentData.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(100);
            dos.writeUTF("Rashi");
            dos.writeDouble(3.8);
            dos.writeInt(101);
            dos.writeUTF("Shantanu");
            dos.writeDouble(3.9);
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}
