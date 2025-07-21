import java.util.Scanner;

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public void showAccountInfo() {
        System.out.println("Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 5) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("This option will be added later.");
            }
        }

        scanner.close();
    }
}
