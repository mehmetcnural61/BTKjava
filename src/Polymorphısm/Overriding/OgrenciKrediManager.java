package Polymorphısm.Overriding;

public class OgrenciKrediManager extends BaseKrediManager{

    //Base hesaplamasını ogrenci icin ezdik, final ile işaretli olsaydı ezemezdik
    @Override
    public double hesapla(double tutar) {
        return tutar*1.10;
    }

//    @Override
//    public void log(String message){
//        System.out.println("Ogrenci Kredi Manager: ");
//    }


    @Override
    public String toString() {
        return "OgrenciKrediManager Hesaplandi";
    }
}
