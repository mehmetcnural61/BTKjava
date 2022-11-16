package ExceptionHandling.Throw;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws Exception {


        if (balance>=amount){
            balance=getBalance()-amount;
        }else{
           // System.out.println("Hesaptan para çekilemedi.Bakiye Yetersiz !");
            throw  new Exception("Bakiye Yetersiz !");
        }
    }

    public double getBalance() {
        return balance;
    }
}
