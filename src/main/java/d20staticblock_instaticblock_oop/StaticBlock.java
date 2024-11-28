package d20staticblock_instaticblock_oop;

import java.time.LocalDate;

public class StaticBlock {


     /*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını
    veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.

     Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
     Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
     bir şekilde hazır olmasını sağlar.*/

    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir


    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
// ve class’in heryerinde bu degeri kullanacak.


    static double pi;

    static  int price;

    static {
        System.out.println("Static block 2");

        LocalDate currentDate = LocalDate.now();//Su anki tarihi aldik

        if (currentDate.getMonthValue() == 10) {//Alinan tarihin ayini aldik ve 2'ye esit mi diye kontrol ettik

            price = 1000;
            System.out.println(price);

        } else {

            price = 2000;
            System.out.println(price);


        }

    }



    static { //static block
        //static bloklar içinde yerel değişkenler tanımlanamaz ama deger atanir
        pi = 3.14;
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method ici");




    }
}
