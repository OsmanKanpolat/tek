package d17constructor_datetime;

public class CarRenner {

    public static void main(String[] args) {

         //4- Car class'indan bir object uretelim

        //9- Default Car() icine parametre girelim
       Car c1 = new Car ("BMW", "3.20",2024, false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.action();//Honda hizli hareket eder
        c1.stop();//Honda guvenli bir sekilde durur

        //5- Car class'a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim

        Car c2 = new Car("Audi" , "A4" , 2018 , false);
        System.out.println(c1);// reference alındı
        System.out.println(c2);// reference alındı

        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim

       //13- CarRunner’a gidip tekrar Run edelim


        //16- Yeni bir object uretelim - SON

        Car c3 = new Car("Tofaş" , "Şahin");
        System.out.println(c3);


    }
}
