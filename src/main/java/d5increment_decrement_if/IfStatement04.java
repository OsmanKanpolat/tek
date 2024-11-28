package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
  1==> Pazar, 2 ==> Pazartesi …*/

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen gün sayısı giriniz.");
        int dag = input.nextInt();

        //if (num <= 0) { //num < 1'de yazabilirdik
            //System.out.println("Gun sayilari 1'den kucuk olamaz");

        if  (dag == 1) {
            System.out.println("pazartesi");
        } else if (dag == 2) {
            System.out.println("salı");

        } else if (dag == 3) {
            System.out.println("çarşamba");
        } else if (dag == 4) {
            System.out.println("perşembe");

        } else if (dag == 5) {
            System.out.println("cuma");
        } else if (dag == 6) {
            System.out.println("cumartesi");
        } else if (dag == 7) {
            System.out.println("pazar");
        } else {
            System.out.println("geçersiz.");

            //System.out.println("Gun sayilari 7'den buyuk olamaz");
        }
    }
}
