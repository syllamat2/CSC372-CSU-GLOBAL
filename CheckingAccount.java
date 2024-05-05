public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super(); // Call superclass constructor
        this.interestRate = 0.0;
    }

    // Setter method for interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method to process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;
        if (amount <= getBalance()) {
            super.withdrawal(amount);
        } else {
            System.out.println("Overdraft fee of $30 applied.");
            //Note that the program does not allow the user can't enter negative amount
            super.withdrawal(getBalance() - (amount + overdraftFee)); 
        }
    }

    // Method to display account information
    public void displayAccount() {
        System.out.println("Checking Account Information:");
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

