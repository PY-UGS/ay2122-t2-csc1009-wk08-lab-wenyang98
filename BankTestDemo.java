import java.util.Scanner;

public class BankTestDemo {
    public static void main(String[] args) {
        try {
            CheckingAccount acc = new CheckingAccount();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount to deposit: ");
            double deposit = scanner.nextDouble();
            acc.deposit(deposit);
            System.out.println("Enter the amount to withdraw:");
            double withdraw = scanner.nextDouble();
            acc.withdraw(withdraw);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
