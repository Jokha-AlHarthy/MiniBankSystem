import java.util.Scanner;

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public BankAccount(String name, String number, double startBalance) {
        accountName = name;
        accountNumber = number;
        balance = startBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void showAccountInfo() {
        System.out.println("Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        BankAccount acc1 = new BankAccount("Jokha", "12345", 100.0);
        BankAccount acc2 = new BankAccount("Khalfan", "67890", 250.0);
        acc1.showAccountInfo();
        acc2.showAccountInfo();


        BankAccount currentAccount = acc1;
        while (running) {
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline


            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter starting balance: ");
                    double bal = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    currentAccount = new BankAccount(name, number, bal);
                    System.out.println("Account created.");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    currentAccount.deposit(depositAmt);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    currentAccount.withdraw(withdrawAmt);
                    break;

                case 4:
                    currentAccount.showAccountInfo();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
