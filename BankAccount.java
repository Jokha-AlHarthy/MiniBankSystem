import java.util.Scanner;

//STEP 2: Create a Menu driven
public class BankAccount {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

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
}
