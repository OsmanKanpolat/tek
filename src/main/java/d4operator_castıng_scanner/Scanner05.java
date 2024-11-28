package d4operator_castıng_scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen 5 rakamlı bir sayı giriniz.");
        int num = input.nextInt();

        int firstTwoDigits = num / 1000;
        int lastTwoDigits = num % 100;

        System.out.println(firstTwoDigits + lastTwoDigits);


    }
}
