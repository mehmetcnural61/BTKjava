package Polymorphısm.Overriding;

public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }



    @Override
    public String toString() {
        return "BaseKrediManager{}";
    }
}
