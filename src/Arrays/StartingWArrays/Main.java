package Arrays.StartingWArrays;

public class Main {
    public static void main(String[] args) {

        // Bad to Good Exp.

        String ogrenci1 = "Mehmet";
        String ogrenci2 = "Mike";
        String ogrenci3 = "Emre";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        //...

        System.out.println("---");

        // array --> [] index 0'dan baslar !
        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Mehmet";
        ogrenciler[1] = "Mike";
        ogrenciler[2] = "Emre";
        ogrenciler[3] = "Alp";
        // ogrenciler[4] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("****");

        //       takma isim
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
