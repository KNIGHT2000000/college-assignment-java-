public class Saving extends Bank_Account {
    double interestRate;

    public Saving(String accountNumber,String accountHolderName, double balance, double interestRate ) {
        super(accountNumber,  accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }


}
