package Polymorphısm.PolymorphısmDemo;

public class ConseleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to Console"+message);
    }
}
