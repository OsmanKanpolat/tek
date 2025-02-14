package d17constructor_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {

    public static void main(String[] args) {

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen verilen sirada tarih bilgisini alt alta giriniz.yil-ay-gun");

        System.out.println("Lutfen yili giriniz");
        int year = input.nextInt();

        System.out.println("Lutfen ayi giriniz");
        int month = input.nextInt();

        System.out.println("Lutfen gunu giriniz");
        int day = input.nextInt();


        //Kullanicidan alinan verilerle bir tarih olusturalim
        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) { //Kullanicinin girdigi tarih su andan onceyse
            System.out.println("Gecersiz tarih girdiniz");
        } else {
            System.out.println("Zamani girebilirsiniz");

        }
    }
}
