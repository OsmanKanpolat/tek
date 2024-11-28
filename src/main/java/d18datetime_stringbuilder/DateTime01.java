package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {

    public static void main(String[] args) {


/*LocalTime Class'ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
    hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


        //ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
// biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.


//DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
// metni tarih ve saat nesnelerine çözmenize olanak tanır.
//ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
// biçimlendirmek için kullanılır.
//format() method’u LocalTime’i String’e istedigimiz formatta cevirir

        LocalTime myCurrentTime = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);


        //Ornek 2: Tarih’i formatlayalim


        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);


        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
//ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
// tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.


        // tokyo da ayın kaçı

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        // Amsterdam da ayın kaçı

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);


        // tokyo da saat kaç

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Arastirma Odevi: Java bu bilgiyi internetten mi cekiyor?


        //Tum zone'lari gorelim

        /*Set <String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String w : zoneIds){
            System.out.println(w);
        }

          //Zaman dilimlerinin sayisini gorelim

        System.out.println("Toplam zaman dilimi sayisi : " + zoneIds.size());*/



        //ornek 4: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy * hh * mm a" );
        String formettedLdt = dtf3.format(ldt);
        System.out.println(formettedLdt);



    }




}
