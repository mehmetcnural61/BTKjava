package Polymorphısm.Overriding;

public class OgrenciKrediManager extends BaseKrediManager{

    //Base hesaplamasını ogrenci icin ezdik, final ile işaretli olsaydı ezemezdik
    @Override
    public double hesapla(double tutar) {
        return tutar*1.10;
    }



    @Override
    public String toString() {
        return "Ogrenci Kredisi Hesaplandi";
    }
}
