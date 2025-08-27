package bankAccount;

public class BankAccount {
    private double balance = 0.0;

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(100);
        System.out.println("Balance = " + b.getBalance());
        System.out.println("Can withdraw 50? " + b.withdraw(50));
    }
}
