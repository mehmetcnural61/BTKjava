package Strings.Strings1;

public class Main {
    public static void main(String[] args) {

        String message = "The weather is very nice today.";

        System.out.println(message);

        System.out.println("Number of elements: " + message.length());
        System.out.println("5. eleman: " + message.charAt(4));
        System.out.println(message.concat(" Woow!"));
        System.out.println(message);
        String message2 = message.concat("Yeeay!");
        System.out.println(message2);

        System.out.println("---");

        //Java case sensetive
        System.out.println(message.startsWith("T"));
        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("."));

        //give me the characters
        char[] characters=new char[3];
        message.getChars(0,3,characters,0);
        System.out.println(characters);

        System.out.println("---");

        // first a letter where ?
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("at"));
        //starts with at the end
        System.out.println(message.lastIndexOf("e"));


    }
}
