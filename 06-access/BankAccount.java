package bankAccount;

public class BankAccount {
    private double balance = 0.0; // private field

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public boolean withdraw(double amt) {
        // Rule: must be >0, ≤ balance, and ≤ 80% of balance
        if (amt > 0 && amt <= balance && amt <= balance * 0.8) {
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

        System.out.println("Balance after deposit: " + b.getBalance());
        System.out.println("Withdraw 50 (valid)? " + b.withdraw(50));
        System.out.println("Balance now: " + b.getBalance());

        System.out.println("Withdraw 90 (exceeds balance)? " + b.withdraw(90));
        System.out.println("Withdraw 85 (exceeds 80% rule)? " + b.withdraw(85));
        System.out.println("Final balance: " + b.getBalance());
    }
}
