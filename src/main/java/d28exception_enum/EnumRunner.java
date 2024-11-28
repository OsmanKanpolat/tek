package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {
        //Cities c = new Cities(); //HATA-enum'dan object uretemezsiniz


        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.AMASYA;
        System.out.println(il); //AMASYA

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

          // Antalya plaka kodu
        System.out.println(Cities.ANTALYA.getPlateCode());

        // kullanıcıdan bir il kodu alınız ve hangi

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen plaka kodu giriniz");
        int plaka = input.nextInt();

        Cities [] sehirler =Cities.values();
        //System.out.println(Arrays.toString(sehirler));



        if (plaka < 0 || plaka > 81){
            System.out.println("lütfen 1 ile 81 arası bir plaka kodu giriniz.");
        }else {

        for (Cities w : sehirler){

            if (plaka == w.getPlateCode()){

                System.out.println("girmis oldugunuz plaka " +  w.getCityName()  +  "iline aittir.");

                break;
            }


        }

        }
    }
}
