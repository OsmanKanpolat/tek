package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz.");
        int num = input.nextInt();


        if (num % 2 == 0) {  // num % 2 != 0
            System.out.println("çift sayıdır.");
        }

        if (num % 2 == 1) {
            System.out.println("tek sayıdır.");


        }
        // 2. yol-------

        if (num % 2 == 0) {
            System.out.println("cift sayıdır.");
        } else {
            System.out.println("tek sayıdır.");

        }
    }
}
