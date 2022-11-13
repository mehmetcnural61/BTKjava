package AbstractClass;

//abstract bir sınıfın abstract olabilmesi için abstract imzasıyla beslenmeli
//operasyonun abstract olabilmesi için abstract ile beslenmeli


public abstract class BaseGameCalculator {

    //kim implemente ediyorsa hesaplamayı içermek zorunda
    //kendi hesaplamasını yazmak zorunda !
    public abstract void hesapla();

    //Gameover olduğu gibi kullanmak zorunda
    public final void gameOver(){

        System.out.println("Oyun Bitti");
    }
}
