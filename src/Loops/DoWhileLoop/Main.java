package Loops.DoWhileLoop;

public class Main {

    public static void main(String[] args) {
        int i=0;

        //0'dan 10'a kadar 10 dahil değil çift sayılar
        do {
            System.out.println(i);
            i+=2;
        }while (i<10);

        System.out.println("----");

        //sartı sağlamasa bile 1 kere çalışıp yazdırdık
        int j=11;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);

        System.out.println("--");
        // for ex. Döngü çalışmasa bile log atmak istiyoruz
        int m=6;
        do {
            System.out.println("Loglandi");
        }while (m<5);

    }
}
