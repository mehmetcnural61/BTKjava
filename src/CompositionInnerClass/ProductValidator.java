package CompositionInnerClass;

//Ana class static olamıyor ama innerclassta olabiliyor
public class ProductValidator {

    static {
        System.out.println("Static Yapici Blok Calisti");
    }

    public ProductValidator(){
        System.out.println("Yapici Blok Calisti");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void baskaBisey(){

    }

    //inner class , gruplandırma amaçlı bölümlendirmek için
    public static class BaskaBirClass{
        public static void sil(){

        }
    }

}
