package Polymorphısm.Overriding;

public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }

    public void log(String message){
        System.out.println("Base Kredi Manager: "+message);
    }

    @Override
    public String toString() {
        return "BaseKrediManager{}";
    }
}
