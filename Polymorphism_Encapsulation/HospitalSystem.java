import java.util.ArrayList;
import java.util.List;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> medicalHistory = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(double dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return medicalHistory;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return medicalHistory;
    }
}
public class HospitalSystem{
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("A001", "Arjun", 45, 5, 2000);
        inPatient.addRecord("Admitted for surgery");
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Records: " + inPatient.viewRecords());

        OutPatient outPatient = new OutPatient("P002", "Neha", 30, 500);
        outPatient.addRecord("General checkup");
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());
        System.out.println("Medical Records: " + outPatient.viewRecords());
    }
}
