public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accountNumber, String branch, Customer owner, double initialDeposit, String employerName, String employerAddress) {
        super(accountNumber, branch, owner, initialDeposit);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String getDetails() {
        return "ChequeAccount: " + accountNumber + ", Balance: " + balance + ", Employer: " + employerName;
    }
}
