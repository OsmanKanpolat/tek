package d3datatypes_concat_operators;

public class Variables01 {


    public static void main(String[] args) {

        //4- long data type:
//Tam sayilar icindir. Hafizada 8 byte (64 bit) yer kaplar
//-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)
//Not: Long olustururken eger deger, Integer’larin maximum degerinden buyuk ise
//sonuna “L” koymak zorundasiniz, yoksa “Integer number too large - Tam sayı çok büyük hatasi alirsiniz.

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long numberOfCell = 123456789012L;
        System.out.print(numberOfCell);

        //Ornek 2: Iki tane Long variable olusturun ve toplamlarini bir etiketle console’a yazdirin.

        long  cell1 = 12233445566L ;
        long  cell2 = 17233445566L ;
        System.out.println("Total cell ; " + (cell1 + cell2 ));


        //5- float data type: Hafizada 32 bit - 4 byte yer kaplar
//(Decimal Numbers ==> ondalikli sayilar) icin kullanilir.
//Ozellikle fiyat degerleri icin "float" kullanilir. App'inizde bu data tipini secmelisiniz.

//Dikkat :Java ondalikli sayilari otomatik olarak double kabul eder.
// (trigonometrik işlemler, logaritmalar vb.) çok hassas sonuçlar gerektiğinde,
// double'ın daha yüksek hassasiyeti faydalı olabilir. O yuzden default double dir.
//float olmasina israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        // Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiket ile console’a yazdiriniz.

        float sokPrice1 = 12.99F;
        float sokPrice2 = 25.99F;
        System.out.println("sum :" + (sokPrice1 + sokPrice2));

        // 2.yol

        float sokPrice3 = 12.99f, sokPrice4 = 25.99f;
        System.out.println("total : " + (sokPrice3 + sokPrice4));


        //3 corap, 2 gomlek olsaydi?
//What if there were 3 socks and 2 shirts?

        System.out.println("totalp : " + (3 * sokPrice1 + 2 * sokPrice2));


        //6- double data type :
//double memory de 8 byte (64 bit) yer kaplar, ondalikli kisim icin daha fazla rakam alir.
// Ondalikli sayilar icin kullanilir. Daha hassas hesaplamalar icin kullanilir.

//Ornek 1: Hucre agirligi icin bir variable olusturup console'a yazdiriniz.
//Example 1: Create a variable for cell weight and print it to the console

double cellWeight = 0.00000000045 ;
        System.out.println(cellWeight);


        //7- char 2 byte’tir (16 bit). Tek karakterler icin kullanilir.
// Sayi, sembol, harf farketmez. Data tek tirnak icine yazilir.
// SD seklinde iki karakter koyamazsiniz.
// Ornegin ‘A’, ‘x’, ‘?’, ‘5’ koyabilirsiniz.

//Ornek 1: char data tipinde bir variable olusturunuz ve icine isminizin ilk harfini yukleyiniz.
//Example 1: Create a variable of char data type and insert the first letter of your name into it.

        char firstLetterOfTheName = 'S';
        System.out.println(firstLetterOfTheName);


        //8- Boolean Data Type: Sadece true (dogru) ve false (yanlis) olmak uzere 2 farkli deger alirlar.

        boolean b1 = true ;
        boolean b2 = false ;
        boolean b3 = true ;
        boolean b4 = false ;
        System.out.println("-----------");
        System.out.println(b1 && b2);
        System.out.println(b2 && b3);
        System.out.println(b2 && b4);
        System.out.println(b3 && b4);


        /*System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
System.out.println()'in bir satır atlayarak çıktı vermesi,
System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir*/

        System.out.print("hello ");
        System.out.print("hell ");

        System.out.println("hello ");
        System.out.println("hell");




    }
}
