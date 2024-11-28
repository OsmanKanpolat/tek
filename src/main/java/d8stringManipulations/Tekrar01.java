package d8stringManipulations;

import java.util.Scanner;

public class Tekrar01 {

    public static void main(String[] args) {

//Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98


        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$" , "");
        System.out.println(tv);
        laptop = laptop.replace("$" , "");
        System.out.println(laptop);

        Double s = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(s);



    }
}
