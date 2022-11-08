package MiniProjects.FriendsNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //220-284

        int number1, number2;
        int toplam1 = 0;
        int toplam2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Number 1 :");
        number1 = input.nextInt();
        System.out.print("Number 2 : ");
        number2 = input.nextInt();

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }

        if (number1 == toplam2 && number2 == toplam1) {
            System.out.println("These two numbers are friends");
        } else {
            System.out.println("These two numbers are not friends !");
        }


    }
}
