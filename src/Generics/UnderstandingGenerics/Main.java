package Generics.UnderstandingGenerics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       MyList<String> cities=new MyList<>();
       cities.add("İzmir");

       // Kızıyor
        // cities.add(1);

        MyList<Customer> customer=new MyList<Customer>();
        customer.add(new Customer());






    }
}
