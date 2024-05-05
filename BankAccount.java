public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }
       
    // Getter method to retrieve balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdrawal(double amount) {
        if (amount>0 && amount<=balance) {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds");
            if (amount<0) balance = amount;
        }
    }

    // Method to print account summary
    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance + "\n");
    }
}