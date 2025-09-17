import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer("Mpho", "Tladi", "133 khama street");
        c.openAccount(new SavingsAccount("SA001", "Gaborone", c, 1000));
        c.openAccount(new InvestmentAccount("IA001", "Gaborone", c, 1000));
        c.openAccount(new ChequeAccount("CA001", "Gaborone", c, 2000, "TechCorp", "789 Tech Park"));
        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Interest 4.Show 5.Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 5) break;
            System.out.print("Account number: ");
            String acc = sc.nextLine();
            Account a = null;
            for (Account x : c.getAccounts()) if (x.getAccountNumber().equals(acc)) a = x;
            if (a == null) { System.out.println("Not found"); continue; }
            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    a.deposit(sc.nextDouble()); sc.nextLine();
                    break;
                case 2:
                    System.out.print("Amount: ");
                    a.withdraw(sc.nextDouble()); sc.nextLine();
                    break;
                case 3:
                    if (a instanceof InterestBearing) ((InterestBearing)a).payInterest();
                    else System.out.println("No interest for this account");
                    break;
                case 4:
                    System.out.println(a.getDetails());
                    break;
            }
        }
        sc.close();
    }
}