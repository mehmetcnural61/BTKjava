package MiniProjects.PerfectNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //6 --> 1,2,3
        //28 --> 1,2,4,7,14

        int number=0;
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Is the number is Perfect ?");
        System.out.print("Enter a number: ");
        number=input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i ==0){
                total=total+i;
            }
        }

        if (number<=1){
            System.out.println("invalid Number");
            return;
        }

        if (total==number){
            System.out.println("Perfect Number ");
        }else {
            System.out.println("Not a Perfect Number !");
        }





    }
}
