package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //if - else if - else Statements


        /*        if () {

        } else if () {

        } else if () {

        } else {

        }*/


        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int num3 = input.nextInt();

        if (num3 > 0){
            System.out.println("pozitiftir.");
        } else if (num3 < 0){
            System.out.println("negatiftir.");
        } else {
            System.out.println("nötrdür.");
        }


    }
}
