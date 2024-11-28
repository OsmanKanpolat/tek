package d4operator_castıng_scanner;

public class TypeCasting {

    public static void main(String[] args) {

/*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
Numeric (sayisal) Data Type ==> byte - short - int - long - float - double */


  /*Not 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
Bu isleme "AutoWidening" (Otomatik genisletme) denir*/

/*Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Veri kaybi olusabilir.
Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
Bu isleme "Explicit Narrowing"(Aciktan Daraltma)denir.*/

//Ornek 1: byte data type’ ini int data type’ina ceviriniz.

        byte  num = 15;
        int nm = num;
        System.out.println(num);

        //Ornek 2: int data type’ ini short data type’ ina ceviriniz.

        int ok = 120;
        short ko = (short) ok;
        System.out.println(ok);











    }
}
