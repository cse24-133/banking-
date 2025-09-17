import java.util.*;

public class Customer {
    private String firstName;
    private String surname;
    private String address;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String surname, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount);
                break;
            }
        }
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.withdraw(amount);
                break;
            }
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
