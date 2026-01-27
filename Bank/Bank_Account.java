public class Bank_Account {
    //creating all attributes of bank account by vyomesh shukla 
    String accountNumber;
    String accountHolderName;
    double balance;
    

    //constructor to initialize bank account

    public Bank_Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        
    }
    //method to display account details
    void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        // System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+balance);
    }


}
