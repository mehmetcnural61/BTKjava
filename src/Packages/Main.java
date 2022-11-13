package Packages;
import Packages.matematik.DortIslem;
import Packages.matematik.Logaritma;
//import matematik.*;  math paketindeki herseyi getir demek

import java.util.Scanner;
//built-in


public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Adinizi Giriniz: ");

        String name=inp.nextLine();

        System.out.println("Merhaba "+name);

        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(2,5));

        Logaritma logaritma=new Logaritma();
        logaritma.logaritmaHesapla();

    }
}
