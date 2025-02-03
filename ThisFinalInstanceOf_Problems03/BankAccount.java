import java.util.*;
class BankAccount{
    static String bankName = "State Bank Of India";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;
    double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void display() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(name, number, balance);
        System.out.println("\nAccount Details:");
if(account instanceof BankAccount){
        account.display();
}else{
System.out.println("not indstance");
}
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}

