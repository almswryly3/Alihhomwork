package HW_lab5.SavingAccount;

public class SavingAccounts {
    private double  balance;
    private double interest;

    public SavingAccounts(double initialize,double interest ){
        balance=initialize;
        this.interest=interest; }

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest()
    {
        balance=((this.interest/100)*balance)+balance;

    }
}
