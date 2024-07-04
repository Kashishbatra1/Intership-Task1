import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void viewAllAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() +
                    ", Account Holder: " + account.getAccountHolderName() +
                    ", Balance: " + account.getBalance());
        }
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}