package Collections.arrayListWithClassDemo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer mehmet = new Customer(0, "Mehmet Can", "Nural");
        customers.add(mehmet);
        customers.add(new Customer(1, "Mehmet", "Nural"));
        customers.add(new Customer(1, "Alp", "Nural"));
        customers.add(new Customer(3, "Mike", "Lowrey"));

        customers.remove(mehmet);
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }


}
