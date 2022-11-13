package AbstractClass.AbstractDemo;

public class CustomerManager {

    //stratejimiz görevini görüyor
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        //bağımlı bir yapı !!
//        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
//        oracleDatabaseManager.getData();

        databaseManager.getData();
    }
}
