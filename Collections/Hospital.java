import java.util.*;
class Patient {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class Hospital{
    public static void main(String[] args) {
        PriorityQueue<Patient> q = new PriorityQueue<>(
            (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );
        q.add(new Patient("Shantanu", 3));
        q.add(new Patient("Riya", 5));
        q.add(new Patient("Diksha", 1));
        q.add(new Patient("Rashi", 4));
        q.add(new Patient("Yash", 2));
        System.out.println("Hospital Triage:");
        while (!q.isEmpty()) {
            System.out.println("Treating: " + q.poll());
        }
    }
}
