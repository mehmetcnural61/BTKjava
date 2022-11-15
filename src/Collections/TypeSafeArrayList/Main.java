package Collections.TypeSafeArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("İzmir");
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Aydın");
        System.out.println(cities);
        cities.remove(2);

        System.out.println("---");

        for (String city:cities){
            System.out.println(cities);
        }

        System.out.println("---");
        //sıralama
        Collections.sort(cities);
        System.out.println(cities);

    }
}
