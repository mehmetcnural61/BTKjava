package MiniProjects.PrimeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int number=0;
         boolean isPrime=true;

        Scanner input=new Scanner(System.in);
        System.out.println("Number is Prime ?");
        System.out.print("Enter a number : ");
        number=input.nextInt();

        if (number==1){
            System.out.println("Number is not Prime !");
            return;
        }

        if (number<2){
            System.out.println("Invalid Number");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime=false;
            }
        }

        if (isPrime==true){
            System.out.println("Number is Prime ");
        }else {
            System.out.println("Number is not Prime !");
        }

        /*
        yukarıdaki ile aynı anlamda !
        if (isPrime){

        }
*/


    }
}
