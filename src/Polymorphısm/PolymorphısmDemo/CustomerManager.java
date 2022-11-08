package Polymorphısm.PolymorphısmDemo;

public class CustomerManager {

    //field oluşturduk
    private BaseLogger logger;

    //çalıştığın logger kim baselogger referansi tutuyor
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müsteri Eklendi");
        this.logger.log("log mesaji");

        //DB bağımlı örnek aşağıdaki
//        DatabaseLogger logger=new DatabaseLogger();
//        logger.log("Log mesaji");
    }
}
