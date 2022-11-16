package ExceptionHandling.ExceptionDemo;

public class Main {
    public static void main(String[] args) {

        //içerdeki kodu çalıştırmayı dene
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata Oluştu: !"+"\nHata: "+exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata Oluştu: !"+"\nHata: "+exception);
        }catch (Exception exception){
            System.out.println("Loglandi: "+exception);
        }
        finally {
            System.out.println("Ben her türlü çalışırım..");
        }

    }
}
