public class Current extends Bank_Account{
    float overdraftLimit;

    public Current(String accountNumber, String accountHolderName, float balance, float overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
   
    public void withdraw(float amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

}
