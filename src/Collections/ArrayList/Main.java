package Collections.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers =new ArrayList();
        System.out.println(numbers.size());
        numbers.add(1);
        numbers.add(10);
        System.out.println(numbers.size());
        numbers.add("Ankara");
        System.out.println(numbers.size());


        System.out.println("====");
        System.out.println(numbers.get(2));
        numbers.set(0,120);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        System.out.println(numbers.get(0));

        //tüm elemanları sil
       // numbers.clear();

        System.out.println("***");

        for (Object i:numbers){
            System.out.println(i);
        }
    }
}
