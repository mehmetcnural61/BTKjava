package Collections.hashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // int -str , str-str ,str-int , int-int , String-Customer herhangi bir Class
        HashMap<String,String> dictionary= new HashMap<String,String>();

        dictionary.put("Book","Kitap");
        dictionary.put("Table","Masa");
        dictionary.put("Computer","Bilgisayar");
        System.out.println(dictionary.size());

        System.out.println("---");

        for (String item: dictionary.keySet()){
            System.out.println("Eleman= "+item+" Değer= "+dictionary.get(item));
        }

        System.out.println("---");

        dictionary.remove("Table");
        dictionary.clear();
        System.out.println(dictionary.get("Table"));



    }
}
