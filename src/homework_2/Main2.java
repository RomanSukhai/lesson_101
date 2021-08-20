package homework_2;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть речення/'Я замінб голосні на пробіл/'");
        String text = sc.next();
        boolean a = text.equalsIgnoreCase(text.replace('e','-'));
    if ((text.indexOf('e') > -1)||(text.indexOf('a') > -1)||
            (text.indexOf('u') > -1)||(text.indexOf('o') > -1)||
            (text.indexOf('E') > -1)||(text.indexOf('A') > -1)||
            (text.indexOf('U') > -1)||(text.indexOf('O') > -1)){
        System.out.println(text.replace('e','-')
                .replace('a','-').replace('o','-').replace('u','-')
                .replace('E','-').replace('A','-').replace('O','-')
                .replace('U','-'));
    }
    else {
        System.out.println(text);
    }
    }


}
