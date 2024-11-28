package d6If_swich;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

// 1.yol---------

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz,");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("cumartesi")
        || dayName.equalsIgnoreCase("pazar")) {
            System.out.println("haftasonu");

        } else if (dayName.equalsIgnoreCase("pazartesi")
        || dayName.equalsIgnoreCase("salı")
        || dayName.equalsIgnoreCase("çarşamba")
        || dayName.equalsIgnoreCase("perşembe")
        || dayName.equalsIgnoreCase("cuma")){
            System.out.println("haftaiçi");

        } else {
            System.out.println("geçerli bir gün giriniz.");


        }








//2.yol----

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay) {
            System.out.println("Weekend");

        } else if (isWeekDay) {
            System.out.println("Weekday");

        } else {
            System.out.println("Enter a valid day name");
        }


        //equals() iki String’in birbirinin aynisi olup olmadigini kontrol eder.
//Bu method boolean return eder(true veya false).

        //equalsIgnoreCase() iki String’in birbirinin aynisi olup olmadigini
//buyuk kucuk harfi dikkate almadan kontrol eder
    }
}
