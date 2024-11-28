package d2variables;

public class Variables01 {
    public static void main( String [] args){

        // java bu satırı okumaz. açıklamadır.
        /*

         */
        String hi = "Hallo World";
        System.out.println("hi");

        /*Java Primitive Data Types:
Not 1 : primitive data type'larini Java olusturmustur, biz olusturamayiz
Not 2 : primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
Not 3 : primitive datalar, data type'larina gore memory'de farkli farkli yer kaplarlar
Not 4 : primitive datalar, iclerinde sadece sizin atadiginiz degeri barindirirlar*/


        //1- byte data type:
//tam sayilar icindir. Hafizada 1 byte(8 bit) yer kaplar
//-128 den + 127’e tamsayi degerleri icin kullanilir
//Ornek 1 : byte data tipinde ogrenci yasi icin bir variable olusturun ve deger atayin.
//Example 1: Create a variable for student age in byte data type and assign a value.

byte studentAge = 12 ;
        System.out.println("studentAge");

        //2- short data type:
//Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
//-32768 den + 32767’e tamsayi degerleri icin kullanilir

        //Ornek 1: Site nufusu icin bir variable olusturun ve 1200 degerini atayin.
//Example 1: Create a variable for the site population and assign it the value 1200.

short nufus = 1200 ;
        System.out.println("nufus");
        //3- int data type:
//tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
//-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir


        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin.
//Example 1: Create a variable for the country population and assign a value.

   int ülkeNufusu = 2456600 ;
        System.out.println(ülkeNufusu);
        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console’a yazdirin.

int dgr1 = 13 ;
int dgr2 = 17 ;
        System.out.println("dgr1");
        System.out.println("dgr2");



        int countryPopulation = 84234543;
        //countryPopulation.soutv
        System.out.println("countryPopulation = " + countryPopulation); //countryPopulation = 84234543
        System.out.println("Turkiye Nufusu : " + countryPopulation); //Turkiye Nufusu : 84234543
        System.out.printf("total nüfüs : " + countryPopulation);
    }
}
