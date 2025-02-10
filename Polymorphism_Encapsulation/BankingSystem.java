abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
     public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
     public void displayDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}
interface Loanable {
    void applyForLoan(double amount);
    
    boolean calculateLoanEligibility();
}

class LoanAccount extends BankAccount implements Loanable {
    private double loanAmount;
    
    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        return 0;
    }
    
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
    }
    
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}
class BankingSystem{
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Rashi", 1000);
        BankAccount current = new CurrentAccount("CA456", "Riya", 5000);
        LoanAccount loan = new LoanAccount("LA123", "Shantanu", 7000);
        
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest());
        loan.applyForLoan(5000);
        System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
        savings.displayDetails();
        current.displayDetails();
        loan.displayDetails();
    }
}
