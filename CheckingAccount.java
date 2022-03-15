public class CheckingAccount {
    private double balance;
    private String accountNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount cannot be negative.");
        }

        if (balance < amount) {
            throw new InsufficientFundsException(amount - balance);
        }
        else {
            balance -= amount;
            System.out.println("The balance after withdraw is: " + balance);
        }
    }
}
