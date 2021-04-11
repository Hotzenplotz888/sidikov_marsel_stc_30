package test01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String text = "Karaoke 01";
        System.out.println("01-01 - "+text);
        //upper and lower case test
        String text00 = text.toLowerCase();
        System.out.println("01-02 - "+text00);
        String text01 = text;
        System.out.println("01-03 - "+text01.toUpperCase(Locale.ROOT));
        System.out.println("01-04 - "+text01.toLowerCase(Locale.ROOT));
        // reverse test
        String text02 = text;
        System.out.println("02-01 - "+StringFormatter.reverseString(text02));
        // character replacing/removing test
        String text03 = text.replaceAll("[\\d]","");
        System.out.println("03-01 - "+text03);
        // Integer
        int number = 5109;
        String s=String.valueOf(number);
        s = s.replaceAll("0","");
        int number1 = Integer.parseInt(s);

        System.out.println("04-01 - "+number1);




    }
}
