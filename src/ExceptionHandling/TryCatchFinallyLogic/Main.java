package ExceptionHandling.TryCatchFinallyLogic;

public class Main {
    public static void main(String[] args) {

        //içerdeki kodu çalıştırmayı dene
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]);
        } catch (Exception exception) {
            System.out.println("Hata Oluştu: !"+"\nHata: "+exception);
        }//oluşan hata parametre olara catch'e verilir
        finally {
            System.out.println("Ben her türlü çalışırım..");
        }
        //veri tabanına bağlandık hata oluştu bağlantıyı kapatmamız gerekir
        //data çekerken hata oldu catch girdik finally ile bağlantıyla kapattık




    }
}
