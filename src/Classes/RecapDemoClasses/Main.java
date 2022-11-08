package Classes.RecapDemoClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb1 = 0;
        int numb2 = 0;
        int selected = 0;

        DortIslem dortIslem = new DortIslem();

        Scanner input = new Scanner(System.in);
        System.out.println("Calculator Started ");


        while (true){
            System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Exit");
            System.out.print("Seciminiz ?: ");
            selected = input.nextInt();
            if (selected>0 && selected<5){

                System.out.print("Sayı 1 Giriniz: ");
                numb1 = input.nextInt();
                System.out.print("Sayı 2 Giriniz: ");
                numb2 = input.nextInt();

                if (selected == 1) {
                    System.out.println("Toplama Sonuc: " + dortIslem.sum(numb1, numb2));
                } else if (selected == 2) {
                    System.out.println("Çıkarma Sonuc: " + dortIslem.extraction(numb1, numb2));
                } else if (selected == 3) {
                    System.out.println("Carpma Sonuc: " + dortIslem.multiply(numb1, numb2));
                } else if (selected == 4) {
                    if (numb2 != 0) {
                        System.out.println("Bolme Sonuc: " + dortIslem.divide(numb1, numb2));
                    } else
                        System.out.println("Bir Sayi 0'a bolunemez !");
                }

            } else if (selected==5) {
                System.out.println("Çıkış Yaptınız");
                break;
            }else {
                System.out.println("Hatali Giris Yapildi !! Tekrar Deneyiniz");
            }

        }



    }
}
