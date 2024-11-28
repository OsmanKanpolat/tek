package d4operator_castıng_scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

/*Ornek 1:
Kullanıcıdan;
i)Adini ve Soyadini ii)Yaşını
iii)Boyunu
iv)Kilosunu
v)Medeni durumunu girmesini isteyin.

Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen ad ve soyadınızı giriniz.");
        String name = input.nextLine();

        System.out.println("lütfen yaşınızı giriniz.");
        byte age = input.nextByte();

        System.out.println("lütfen boyunuzu giriniz");
        float boy = input.nextFloat();

        System.out.println("lütfen kilonuzu giriniz");
        short kilo = input.nextShort();

        System.out.println("lütfen medeni durumunuzu giriniz");
        String evli = input.next();

        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("boy :" + boy);
        System.out.println("kilo :" + kilo);
        System.out.println("evli :" + evli);
    }
}
