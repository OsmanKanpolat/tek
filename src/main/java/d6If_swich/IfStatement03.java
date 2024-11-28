package d6If_swich;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //nested : icice gecmis demektir

        /*ornek 1:
    Kisi erkek ise;
          i)16 yasindan kucuk ise calismamali
          ii)16 - 65(dahil) arasi calismali
          iii)65 yasindan buyuk ise emekli olmali
    Kisi kadin ise;
         i)18 yasindan kucuk ise calismamali
         ii)18 - 60 (dahil) arasi calismali
         iii)60 yasindan buyuk ise emekli olmali
   Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/


        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz.");
        String gender = input.next();

        System.out.println("yasınızı giriniz");
        int age = input.nextInt();


        if (gender.equalsIgnoreCase("erkek")){

            if (age < 0){
                System.out.println("yas negatif olamaz.");

            }else if (age<16){
                System.out.println("çalısmamalı");

            }else if (age<=65){
                System.out.print("çalısmalı");

            }else {
                System.out.println("emekli olmalı");

            }

        }else if (gender.equalsIgnoreCase("kadın")){
            if (age < 0){
                System.out.println("yas negatif olamaz.");

            }else if (age<18){
                System.out.println("çalısmamalı");

            }else if (age<=60){
                System.out.print("çalısmalı");

            }else {
                System.out.println("emekli olmalı");
            }

        }else {
            System.out.println("farklı bir tanım.");

        }















































    }
}
