package d6If_swich;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

/*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic ay sayisini giriniz");
        byte numOfMonth = input.nextByte();


        switch (numOfMonth){
            case 1 :
                System.out.println("ocak");
                case 2 :
                System.out.println("şubat");
                case 3 :
                System.out.println("mart");
                case 4 :
                System.out.println("nisan");
                case 5 :
                System.out.println("mayıs");
                case 6 :
                System.out.println("haziran");
                case 7 :
                System.out.println("temmuz");
                case 8 :
                System.out.println("ağustos");
                case 9 :
                System.out.println("eylul");
                case 10 :
                System.out.println("ekim");
                case 11 :
                System.out.println("kasım");
                case 12 :
                System.out.println("aralık");
                break ;
            default:
                System.out.println("Gecerli bir ay sayısı giriniz");


        }

     /*Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz
   switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz */
    }
}
