
package HomeWork.BankAccount;

public class Bank {
    private String accountNumber;
    private String owner;
    private int balance;

    public Bank(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful.");
            return true;
        } else {
            System.out.println("Withdraw failed.");
            return false;
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    public void addInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
    }
}