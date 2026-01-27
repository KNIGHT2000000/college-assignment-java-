public class Main {

    public static void main(String[] args) {

        Bank_Account b1=new Bank_Account("122344","vyomesh shukla",5000.0);
        b1.displayAccountDetails();
        Current b2=new Current("56789","shukla corp",10000.0f,5000.0f);
        b2.deposit(2000.0);
        b2.withdraw(1500.0f);
  
}}