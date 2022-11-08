package Strings.Strings2;

public class Main {
    public static void main(String[] args) {

        String message = "The weather is very nice today.";
        String message2 = "   The weather is very nice today.    ";
        System.out.println(message);

        System.out.println("---");
        System.out.println(message.replace(' ','-'));
        System.out.println("----");
        String newMessage=message.replace(' ','-');
        System.out.println(newMessage);

        System.out.println(message.substring(3));
        System.out.println(message.substring(3,25));

        System.out.println("---");
        // her bir kelimeyi ayırıp alt alta yazdık
        for (String kelime:message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("--");
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        // delete the spaces beginning and end
        System.out.println(message2.trim());

    }
}
