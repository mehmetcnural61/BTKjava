package ExceptionHandling.CustomException;

public class AccountManager {

    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {


        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            // System.out.println("Hesaptan para çekilemedi.Bakiye Yetersiz !");
            throw new BalanceInsufficentException("Bakiye Yetersiz !");
        }
    }

    public double getBalance() {
        return balance;
    }
}