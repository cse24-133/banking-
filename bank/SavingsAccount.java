public class SavingsAccount extends Account implements InterestBearing {
    public SavingsAccount(String accountNumber, String branch, Customer owner, double initialDeposit) {
        super(accountNumber, branch, owner, initialDeposit);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Savings Account.");
    }

    @Override
    public void payInterest() {
        balance += balance * 0.0005; // 0.05%
    }

    @Override
    public String getDetails() {
        return "SavingsAccount: " + accountNumber + ", Balance: " + balance;
    }
}
