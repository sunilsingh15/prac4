public class BankAccount {
    
    String accountNumber = "";
    String accountName = "";
    double balance;
    
    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your new balance is " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw whatever");
            return false;
        } else {
            balance -= amount;
            System.out.println("Your new balance is " + balance);
            return true;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
                + "]";
    }

}
