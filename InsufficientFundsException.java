public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(double amount) {
        super("Sorry, but your account is short by: " + amount);
    }
}
