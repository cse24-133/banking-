public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer owner;

    public Account(String accountNumber, String branch, Customer owner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.owner = owner;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract String getDetails();
}
