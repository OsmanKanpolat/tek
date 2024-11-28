package d6If_swich;

import java.util.Scanner;

public class Tekrar01 {

    public static void main(String[] args) {

        /*i)16 yasindan kucuk ise calismamali
        ii)16 - 65(dahil) arasi calismali
        iii)65 yasindan buyuk ise emekli olmali
        Kisi kadin ise;
        i)18 yasindan kucuk ise calismamali
        ii)18 - 60 (dahil) arasi calismali
        iii)60 yasindan buyuk ise emekli olmali
        Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz.");
        String name = input.next();

        System.out.println("lütfen yasınızı giriniz.");
        int age = input.nextInt();

        if (name.equalsIgnoreCase("erkek")) {


            if (age < 0) {
                System.out.println("negatif olamaz");

            } else if (age < 16) {
                System.out.println("çaşmamalı");

            } else if (age < 65) {
                System.out.println("çalışmalı");

            } else {
                System.out.println("emekli");


            }


        } else if (name.equalsIgnoreCase("kadın")) {
            if (age < 0) {
                System.out.println("negatif olamaz");

            } else if (age < 18) {
                System.out.println("çaşmamalı");

            } else if (age < 65) {
                System.out.println("çalışmalı");

            } else {
                System.out.println("emekli");

            }
        }
    }
}

