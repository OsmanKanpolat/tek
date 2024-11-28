package d5increment_decrement_if;

public class IfStatement01 {

    public static void main(String[] args) {

        //if statements

        if (7 < 5) {
            System.out.println("condıtıon doğru , if calıştı");

            //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.

            int num = 12;

            if (num > -1 && num < 10) {    //num >= 0' da calisir


                System.out.println("bu bir rakamdır.");
            }


            //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.


            int num1 = 123;

            if (num1 >99 && num1 < 1000){

                System.out.println("sayı üç basamaklıdır.");
            }




        }

    }
}
