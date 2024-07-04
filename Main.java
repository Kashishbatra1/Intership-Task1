import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Sample accounts
        bank.addAccount(new Account("12345", "Kashish", 1000));
        bank.addAccount(new Account("67890", "PK", 2000));

        while (true) {
            System.out.println("\n1. View All Accounts");
            System.out.println("2. Find Account by Number");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice =scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    bank.viewAllAccounts();
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    Account account = bank.findAccountByNumber(accountNumber);
                    if (account != null) {
                        System.out.println("Account found: " +
                                "Account Number: " + account.getAccountNumber() +
                                ", Account Holder: " + account.getAccountHolderName() +
                                ", Balance: " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.findAccountByNumber(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.findAccountByNumber(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.findAccountByNumber(accountNumber);
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using the banking system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}