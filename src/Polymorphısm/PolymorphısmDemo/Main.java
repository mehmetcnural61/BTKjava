package Polymorphısm.PolymorphısmDemo;

public class Main {
    public static void main(String[] args) {

//        EmailLogger logger = new EmailLogger();
//
//        logger.log("Log Message");


        //plug-in play


        BaseLogger[] loggers = new BaseLogger[]{
                new FileLogger(),new EmailLogger()
                ,new DatabaseLogger(),new ConseleLogger()};

        //Baselogger türünde loggers
        for (BaseLogger logger:loggers){

            logger.log("Log Mesajı");
        }

        System.out.println("===");

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
