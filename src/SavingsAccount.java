public class SavingsAccount extends BankAccount {

    double rate = 0;

    public SavingsAccount() {
    }

    public SavingsAccount(String accountNumber, String accountName, double balance, double rate) {
        super(accountNumber, accountName, balance);
        this.rate = rate;
    }

    public double calculateInterest() {
        double interest = balance * (rate / 100);
        return interest;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
        + ", rate=" + rate + "]";
    }



    
}
