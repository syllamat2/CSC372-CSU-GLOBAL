public class CTA1_Main {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.deposit(1000);
        account.withdrawal(500);
        account.accountSummary();
        //withdraw more than balance when overdraft is not applied
        account.withdrawal(700);
        account.accountSummary();


        CheckingAccount C_account = new CheckingAccount();
        C_account.setFirstName("Makht");
        C_account.setLastName("Smith");
        C_account.setAccountID(98765);
        C_account.setInterestRate(1.5);
        C_account.deposit(1000);
        C_account.processWithdrawal(1500); // This will trigger an overdraft fee
        C_account.displayAccount();
    
    }
}
