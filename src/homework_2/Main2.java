package homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть речення/'Я замінб голосні на пробіл/'");
        String text = sc.next();
        if ((text.indexOf('e') > -1)){
            if ((text.indexOf('a') > -1)){
                if ((text.indexOf('u') > -1)){
                    if ((text.indexOf('o') > -1)){
                        System.out.println(text.replace('e','-').replace('a','-').replace('o','-').replace('u','-'));
                    }else{
                        System.out.println(text.replace('e','-').replace('a','-').replace('u','-'));
                    }
                }else{
                    System.out.println(text.replace('e','-').replace('a','-'));
                }
            }else {
                System.out.println(text.replace('e','-'));
            }

        }else {
            System.out.println(text);
        }


    }
}
