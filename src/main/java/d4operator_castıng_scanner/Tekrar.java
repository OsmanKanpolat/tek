package d4operator_castıng_scanner;

import java.util.Scanner;

public class Tekrar {

    public static void main(String[] args) {

        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz.");

        byte age = input.nextByte();

        System.out.println("yaşım : " + age);
    }
}
