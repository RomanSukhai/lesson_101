package homework_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Введіть будь ласка поліндром («пилип», «ротор») з 5 символів: ");
        String a = sc.next();
        String aUpperCase =a.toUpperCase(Locale.ROOT);
        int first = aUpperCase.charAt(0);
        int last = aUpperCase.charAt(4)
        ;
        if (a.length()>6){
            throw new StringIndexOutOfBoundsException("Values must be smaller 6 symbol ");
        }if (first == last){
            System.out.println("Поліндром: "+a);
        }else {
            throw new StringIndexOutOfBoundsException("Values must be polindrom ");

        }


    }
}
