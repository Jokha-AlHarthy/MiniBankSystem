import java.util.Scanner;

public class BankAccount {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //STEP 2: Create a Menu driven
        while(running){
            System.out.println("====== Mini Bank Menu ======");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

        //STEP 3: creating a basic class
        String accountName;
        String accountNumber;
        double balance;

        public void showAccountInfo() {
            System.out.println("Name: " + accountName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }

        //STEP 4: Add a Constructor
        public BankAccount(String name, String number, double startBalance) {
            accountName = name;
            accountNumber = number;
            balance = startBalance;
        }

        BankAccount acc1 = new BankAccount("Jokha", "12345", 100.0);





}
