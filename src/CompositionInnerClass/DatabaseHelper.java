package CompositionInnerClass;

//Best practice'ler önermiyor !!
//Solid'in single resp neden olur 2ayrı class daha mantıklı

public class DatabaseHelper {

    //Create-read-update-delete
    public static class Crud{
        public static void update(){

        }
        public static void delete(){

        }
    }
    public static class Connection{
        public static void createConnection(){

        }
    }
}
