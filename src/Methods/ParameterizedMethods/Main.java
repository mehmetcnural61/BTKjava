package Methods.ParameterizedMethods;

public class Main {
    public static void main(String[] args) {
        String message = "Today is weather very nice";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);
        String newMessage2=giveCityName();
        System.out.println(giveCityName());
        int numbers=sum(5,9);
        System.out.println(numbers);
        System.out.println("----");

        int total=sum(2,3,4,1);
        System.out.println(total);

    }

    public static void add() {
        System.out.println("Added to DB");
    }

    public static void delete() {
        System.out.println("Deleted from DB");
    }

    public static void update() {
        System.out.println("DB Updated");
    }

    public static int sum(int number1,int number2) {
        return number1+number2;
    }

    // variable arguments ... üç nokta
    public static int sum(int... numbers){
        int total=0;
        for (int number:numbers){
            total+=number;
        }
        return total;
    }

    public static String giveCityName() {
        return "İzmir";
    }
}
