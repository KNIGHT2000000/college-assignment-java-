
// Parent class
class BankAccount {
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in " + this.getClass().getSimpleName());
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from " + this.getClass().getSimpleName());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    public void calculateInterest() {
        System.out.println("Calculating interest for base BankAccount...");
    }
    
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
    
    public double getBalance() {
        return balance;
    }
}

// Child class - Saving Account
class Saving extends BankAccount {
    private double interestRate = 0.04; // 4% interest
    
    public Saving(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    
    // Method overriding - Saving account has limited withdrawals
    @Override
    public void withdraw(double amount) {
        System.out.println("Savings Account: Limited withdrawals per month!");
        super.withdraw(amount);
    }
    
    // Method overriding - Calculate interest for Saving account
    @Override
    public void calculateInterest() {
        double interest = this.getBalance() * interestRate;
        System.out.println("Saving Account Interest (4%): " + interest);
    }
}

// Child class - Current Account
class Current extends BankAccount {
    private double overdraftLimit = 5000;
    
    public Current(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    
    // Method overriding - Current account allows overdraft
    @Override
    public void withdraw(double amount) {
        if (this.getBalance() + overdraftLimit >= amount) {
            System.out.println("Current Account: Overdraft allowed!");
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }
    
    // Method overriding - No interest for Current account
    @Override
    public void calculateInterest() {
        System.out.println("Current Account: No interest earned!");
    }
}

// Main class to demonstrate method overriding
public class bank {
    public static void main(String[] args) {
        // Create Saving Account
        System.out.println("=== SAVING ACCOUNT ===");
        BankAccount savingAccount = new Saving("John", 10000);
        savingAccount.displayDetails();
        savingAccount.deposit(5000);
        savingAccount.withdraw(2000);
        savingAccount.calculateInterest();
        
        System.out.println("\n=== CURRENT ACCOUNT ===");
        // Create Current Account
        BankAccount currentAccount = new Current("Alice", 20000);
        currentAccount.displayDetails();
        currentAccount.deposit(3000);
        currentAccount.withdraw(18000);
        currentAccount.calculateInterest();
        
        System.out.println("\n=== BASE BANK ACCOUNT ===");
        // Create Base BankAccount
        BankAccount basicAccount = new BankAccount("Bob", 5000);
        basicAccount.displayDetails();
        basicAccount.deposit(1000);
        basicAccount.withdraw(500);
        basicAccount.calculateInterest();
    }
}
