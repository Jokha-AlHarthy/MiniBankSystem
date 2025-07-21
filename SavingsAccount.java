public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String name, String number, double balance, double rate) {
        super(name, number, balance); // use parent constructor
        this.interestRate = rate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest Applied: $" + interest);
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}