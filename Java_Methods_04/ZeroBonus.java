import java.util.*;
public class ZeroBonus{
    public static double[][] EmployeeDetails() {
        Random random = new Random();
        double[][] employeeDetails = new double[10][2];
        for (int i = 0; i < 10; i++) {
            employeeDetails[i][0] = random.nextInt(90000) + 10000;
            // Generate random years of service between 1 and 20
            employeeDetails[i][1] = random.nextInt(20) + 1;
        }
        return employeeDetails;
    }
     
    public static double[][] calculateBonusAndNewSalary(double[][] employeeDetails) {
        double[][] updatedDetails = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeDetails[i][0];
            int yearsOfService = (int) employeeDetails[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            updatedDetails[i][0] = newSalary;
            updatedDetails[i][1] = bonus;
            updatedDetails[i][2] = oldSalary;
        }
        return updatedDetails;
    }
    public static void calculateAndDisplaySums(double[][] employeeDetails, double[][] updatedDetails) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            sumOldSalary += employeeDetails[i][0];
            sumNewSalary += updatedDetails[i][0];
            totalBonus += updatedDetails[i][1];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + updatedDetails[i][2] + updatedDetails[i][1] + updatedDetails[i][0]);
        }
        System.out.println("Sum of Old Salary: " + sumOldSalary);
        System.out.println("Sum of New Salary: " + sumNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] employeeDetails = EmployeeDetails();
        double[][] updatedDetails = calculateBonusAndNewSalary(employeeDetails);
        calculateAndDisplaySums(employeeDetails, updatedDetails);
    }
}
