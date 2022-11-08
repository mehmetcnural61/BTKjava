package Methods.UnderstandingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        findingNumber();


    }

    //method names camelCase
    public  static  void  findingNumber(){
        int numbers=0;
        int[] array=new int[5];
        int search=0;
        boolean isThere=false;

        Scanner input=new Scanner(System.in);
        System.out.print("How Many Numbers Do you want to store ? :");
        numbers=input.nextInt();

        for (int i = 0; i < numbers; i++) {
            System.out.print("Sayiyi giriniz: ");
            array[i]=input.nextInt();
        }

        System.out.print("Which Number you want to search ?: ");
        search=input.nextInt();
        for (int number:array){
            if (number==search){
                isThere=true;
                break;
            }
        }
        if (isThere){
            giveMessage("the number is included: "+search);
        }else {
            giveMessage("the number is not included: "+search);
        }
        System.out.println("Numbers:" +Arrays.toString(array));
    }

    //parameterized method
    public static void giveMessage(String message){
        System.out.println(message);
    }
}
