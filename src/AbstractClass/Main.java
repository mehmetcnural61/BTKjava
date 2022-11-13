package AbstractClass;

public class Main {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();

        //abstract sınıflar new'lenemez !
        // new'lenebilmesi için ezilmesi gerekmekte !! ama iyi bir kullanım değil

        BaseGameCalculator gameCalculator= new WomanGameCalculator();

    }
}
