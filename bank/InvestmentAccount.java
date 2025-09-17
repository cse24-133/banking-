public class InvestmentAccount extends Account implements InterestBearing {
    public InvestmentAccount(String accountNumber, String branch, Customer owner, double initialDeposit) {
        super(accountNumber, branch, owner, initialDeposit);
        if (initialDeposit < 500) {
            throw new IllegalArgumentException("Minimum opening deposit is BWP500.00");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public void payInterest() {
        balance += balance * 0.05; // 5%
    }

    @Override
    public String getDetails() {
        return "InvestmentAccount: " + accountNumber + ", Balance: " + balance;
    }
}
