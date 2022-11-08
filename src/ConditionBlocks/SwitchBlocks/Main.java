package ConditionBlocks.SwitchBlocks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char grade='A';



        switch (grade) {
            case 'A':
                System.out.println("Mukemmel :Gectiniz");
                break;
            case 'B':
                System.out.println("Güzel : Gectiniz");
                break;
            case 'C':
                System.out.println("İyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil: Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız !");
                break;
            default:
                System.out.println("Gecersiz Not Girdiniz !");
        }

    }
}
