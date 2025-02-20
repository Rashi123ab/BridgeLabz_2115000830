import java.util.*;
class BankingSystem{
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();
    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        }
    }
    public void withdraw(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            withdrawalQueue.add(accountNumber);
        }
    }
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            double amount = 10;  
            if (accounts.get(accountNumber) >= amount) {
                sortedAccounts.remove(accounts.get(accountNumber));
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                sortedAccounts.put(accounts.get(accountNumber), accountNumber);
            }
        }
    }
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();
        b.createAccount(101, 500.0);
        b.createAccount(102, 1000.0);
        b.deposit(101, 200.0);
        b.withdraw(102, 300.0);
        b.processWithdrawals();
        System.out.println(b.accounts);
    }
}
