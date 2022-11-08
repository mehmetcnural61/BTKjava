package Classes.WhatIsClassAndHowItWorks;

public class Main {
    public static void main(String[] args) {

        //Customermanager türünde bir nesne ürettik

        // CustomerManager customerManager=new CustomerManager();  New Expensive !

        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //GC garbage collector -- Çöpçü--> bellek yöneticisi




    }
}
