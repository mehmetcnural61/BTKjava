package MyChallanges.NumberComparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Karşılaştırmak istediğiniz 1.sayiyi giriniz: ");
        number1=input.nextInt();
        System.out.print("Karşılaştırmak istediğiniz 2.sayiyi giriniz:");
        number2=input.nextInt();

        if (number1<number2){
            System.out.println("2.Sayi 1.Sayidan büyüktür !");
        } else if (number1==number2) {
            System.out.println("Sayilar birbirine eşittir !");
        }else {
            System.out.println("1.Sayi 2.Sayidan büyüktür !");
    }


    }
}
