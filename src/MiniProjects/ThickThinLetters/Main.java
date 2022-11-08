package MiniProjects.ThickThinLetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char harf = ' ';

        Scanner input = new Scanner(System.in);
        System.out.println("Letter is Thick or Thin ?");
        System.out.print("Enter a letter :");
        harf = input.next().charAt(0);

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Thick Voiced Letter");
                break;
            default:
                System.out.println("Thin Voiced Letter");
        }


    }
}
